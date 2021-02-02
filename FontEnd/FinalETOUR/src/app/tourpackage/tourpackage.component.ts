import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';

import { ClassPackagecomplete } from '../class-packagecomplete';
import { Dateclass } from '../dateclass';
import { EtourService } from '../etour.service';
import { Itinerary } from '../itinerary';
import { Priceclass } from '../priceclass';

@Component({
  selector: 'app-tourpackage',
  templateUrl: './tourpackage.component.html',
  styleUrls: ['./tourpackage.component.css']
})
export class TourpackageComponent implements OnInit {

  form:FormGroup;
  packdetail:ClassPackagecomplete;
  itineraries:Itinerary[];
  date:Dateclass;
  isDisabled=true;
  totalCost:number;
  constructor(private _activatedRoute:ActivatedRoute, private _etourService:EtourService,private _fb:FormBuilder) { }

  ngOnInit(): void {
    let Id :string= this._activatedRoute.snapshot.params['id'];
    
    this._etourService.getPackageDetails(Id).subscribe(data=>this.packdetail=data);
    this.form= this._fb.group({
      Adults:['',Validators.required],
      ChildWB:[''],
      ChildWOB:['']
    })
  }

  fetchItenary(){
    this.isDisabled=true;
    this._etourService.getItenaryDetails(this.packdetail.packageid).subscribe(
      data=>{
        this.itineraries=data;
        this.date=undefined;
      }
    );
  }

  fetchDate(){
    this.isDisabled=true;
    this._etourService.getDateDetails(this.packdetail.packageid).subscribe(
      data=>{
        this.date=data;
        this.itineraries=[];
        console.log(this.date);
      }
    );
  }

  passengerDetails(){
    this.itineraries=[];
    this.date=undefined;
    this.isDisabled=false;
  }

  onSubmit(){
    var adult = this.form.controls.Adults.value;
    var childwb = this.form.controls.ChildWB.value;
    var childwob = this.form.controls.ChildWOB.value;
    var NoOfPassengers = adult+childwb+childwob;
    var price:Priceclass;
    this._etourService.getPriceDetails(this.packdetail.packageid).subscribe(
      data=>{
        price = data;
        this.totalCost = adult * price.adults;
      if(childwb>0){
        this.totalCost += childwb*price.childwithbed;
      }
      if(childwob>0){
        this.totalCost += childwob*price.childwobed;
      }
      localStorage.setItem('NoOfPassengers',NoOfPassengers);
      localStorage.setItem('TotalCost',this.totalCost.toString());
      }
    );
      }
}

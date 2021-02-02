import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { EtourService } from '../etour.service';
import { Passengerclass } from '../passengerclass';

@Component({
  selector: 'app-passengerdetail',
  templateUrl: './passengerdetail.component.html',
  styleUrls: ['./passengerdetail.component.css']
})
export class PassengerdetailComponent implements OnInit {
  num :number= parseInt(localStorage.getItem('NoOfPassengers'));
  Arr = Array;
  form: FormGroup = new FormGroup({
    
            dob: new FormControl,
           email: new FormControl,
           userPassportNo:new FormControl,
            passengername:new FormControl
            
  }
  );
    loading = false;
    submitted = false;
    passengers:Passengerclass[] = new Array<Passengerclass>();
    packageId:number = parseInt(this.route.snapshot.params['id']);
  constructor(private formBuilder: FormBuilder,
    private route: ActivatedRoute,
    private router: Router,
    private etourService: EtourService) {
    console.log(this.num);
   }

   ngOnInit() {
    this.form = this.formBuilder.group({
     
      
        
        email:['',Validators.required],
        userPassportNo:['',Validators.required],
        passengername:['',Validators.required]
        
    });
}
get f() { return this.form.controls; }
onSubmit() {
  this.submitted = true;


  // stop here if form is invalid
  if (this.form.invalid) {
    console.log("Failed");
      return;
  }

  this.loading = true;
  this.etourService.passengerUser(this.passengers).subscribe(
          data => {
            console.log(data);
            this.router.navigate(['../Login']);
          },
          error => {
              this.loading = false;
          });
}

getData(passenger:Passengerclass){
  passenger.packageid =  this.packageId;
  this.passengers.push(passenger);
  console.log(this.passengers);
  if(this.num == this.passengers.length){
    console.log(this.passengers);
    this.etourService.passengers = this.passengers;
    this.onSubmit();
  }
}

}

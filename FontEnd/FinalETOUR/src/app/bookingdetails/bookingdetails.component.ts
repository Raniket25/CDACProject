import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { EtourService } from '../etour.service';
import { Passengerclass } from '../passengerclass';

@Component({
  selector: 'app-bookingdetails',
  templateUrl: './bookingdetails.component.html',
  styleUrls: ['./bookingdetails.component.css']
})

export class BookingdetailsComponent implements OnInit {

  tourForm: FormGroup;
  submitted = false;
  totalCost = parseInt(localStorage.getItem('TotalCost'));
  passengers:Passengerclass[];
  ngOnInit(): void {
    
  }

  constructor(private _bookingService:EtourService) {
    this.passengers = this._bookingService.passengers;
  }



}

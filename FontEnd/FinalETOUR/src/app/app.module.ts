import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BookingdetailsComponent } from './bookingdetails/bookingdetails.component';
import { ContactusComponent } from './contactus/contactus.component';
import { HomeComponent } from './home/home.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import{HttpClientModule} from '@angular/common/http';
import { SuccessComponent } from './success/success.component';
import { CategorySubComponent } from './category-sub/category-sub.component';
import { TourpackageComponent } from './tourpackage/tourpackage.component';
import { PackagecompletedetailsComponent } from './packagecompletedetails/packagecompletedetails.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { PassengerdetailComponent } from './passengerdetail/passengerdetail.component';
import { EtourService } from './etour.service';
import { Passengerclass } from './passengerclass';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegistrationComponent,
    BookingdetailsComponent,
    ContactusComponent,
    HomeComponent,
    NavbarComponent,
    FooterComponent,
    SuccessComponent,
    CategorySubComponent,
    TourpackageComponent,
    PackagecompletedetailsComponent,
    PassengerdetailComponent,
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule
  ],
  providers: [EtourService],
  bootstrap: [AppComponent]
})
export class AppModule { }

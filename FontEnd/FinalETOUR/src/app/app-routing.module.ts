import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BookingdetailsComponent } from './bookingdetails/bookingdetails.component';
import { CategorySubComponent } from './category-sub/category-sub.component';
import { ContactusComponent } from './contactus/contactus.component';
import { FooterComponent } from './footer/footer.component';
import { HomeComponent } from './home/home.component';

import { LoginComponent } from './login/login.component';
import { NavbarComponent } from './navbar/navbar.component';
import { PassengerdetailComponent } from './passengerdetail/passengerdetail.component';
import { RegistrationComponent } from './registration/registration.component';
import { SuccessComponent } from './success/success.component';
import { TourpackageComponent } from './tourpackage/tourpackage.component';

const routes: Routes = [
  { path: 'Login', component: LoginComponent},
  { path: 'Registration', component: RegistrationComponent },
  {path: 'Booking', component: BookingdetailsComponent },
{ path: 'Contactus', component: ContactusComponent},
{ path: 'home', component: HomeComponent},
{ path: 'navbar', component:NavbarComponent},
{ path: 'footer', component:FooterComponent},
{ path: 'success', component:SuccessComponent},
{ path: 'categorysub', component:CategorySubComponent},
{path:'tour/:id',component:TourpackageComponent},
{path:'passengerdetails/:id',component:PassengerdetailComponent},
{path:'BookingDetails',component:BookingdetailsComponent},
{ path: '', redirectTo:'/home', pathMatch:'full'},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { UserRegistration } from './user-registration';
import {Login} from './login';
import { Observable } from 'rxjs';
import { ClassCategorysub } from './class-categorysub';
import { ClassPackagecomplete } from './class-packagecomplete';
import { Itinerary } from './itinerary';
import { Dateclass } from './dateclass';
import { Priceclass } from './priceclass';
import { Passengerclass } from './passengerclass';


@Injectable({
  providedIn: 'root'
})
export class EtourService {
  passengers:Passengerclass[];
  url='http://localhost:8080/registerUser';
  urls='http://localhost:8080/login';
  caturl='http://loacalhost:8080/category';
  fetchSubCategoryUrl='http://localhost:8080/category';
  fetchFurtherSubCategoryUrl='http://localhost:8080/subcategory';
  fetchPackageDetails = 'http://localhost:8080/packcompdetail';
  fetchItineraryDetails='http://localhost:8080/itinerary';
  fetchDateDetails='http://localhost:8080/datepackdetail';
  fetchPriceDetails='http://localhost:8080/pricedetail';
  fetchPassengerDetails='http://localhost:8080/passuer';
  constructor(private _http:HttpClient) { }

 passengerUser(passengeruser:Passengerclass[]):any{
    return this._http.post<Passengerclass[]>(this.fetchPassengerDetails,passengeruser);
  }
  registerUser(userregistration:UserRegistration):any{
    return this._http.post<any>(this.url,userregistration);
  }

   loginUser(login:string):Observable<UserRegistration>{
      return this._http.get<UserRegistration>(this.urls+'/'+login);
    }

  getSubCategory():Observable<ClassCategorysub[]>{
    return this._http.get<ClassCategorysub[]>(this.fetchSubCategoryUrl);
  }

  getCategorySubCategory(subCategory:String):Observable<ClassCategorysub[]>{
    return this._http.get<ClassCategorysub[]>(this.fetchFurtherSubCategoryUrl+'/'+subCategory);
  }

  getPackageDetails(catSubId:string):Observable<ClassPackagecomplete>{
    return this._http.get<ClassPackagecomplete>(this.fetchPackageDetails+'/'+catSubId);
  }

  getItenaryDetails(packageId:Number):Observable<Itinerary[]>{
    return this._http.get<Itinerary[]>(this.fetchItineraryDetails+'/'+packageId);
  }

  getDateDetails(packageId:Number):Observable<Dateclass>{
    return this._http.get<Dateclass>(this.fetchDateDetails+'/'+packageId);
  }

  getPriceDetails(packageId:Number):Observable<Priceclass>{
    return this._http.get<Priceclass>(this.fetchPriceDetails+'/'+packageId);
  }

}


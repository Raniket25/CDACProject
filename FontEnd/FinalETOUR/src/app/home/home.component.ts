import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ClassCategorysub } from '../class-categorysub';
import { EtourService } from '../etour.service';
import { MatCarousel, MatCarouselComponent } from '@ngmodule/material-carousel';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  categorySub:ClassCategorysub[];
  subCategory:ClassCategorysub[];
  subCategory2:ClassCategorysub[];
  constructor(private _router:Router,private _activatedRoute:ActivatedRoute, private _etourService:EtourService) { 
    this.categorySub=[];
    this.subCategory=[];
    
  }


  ngOnInit(): void {
    this._etourService.getSubCategory().subscribe(data=> this.categorySub=data);
  
  }

  fetchSubCategory(subCategory:ClassCategorysub){
    if(subCategory.flag==1){
      this.proceedToTourPage(subCategory.catsubid);
    }
    this._etourService.getCategorySubCategory(subCategory.categoryid).subscribe(
      data=>{
        this.subCategory=data;
        this.categorySub=[];
      });
  }

  fetchFurtherSubCategory(subCategory:ClassCategorysub){
    this._etourService.getCategorySubCategory(subCategory.categoryid).subscribe(data=>{
      this.subCategory2=data;
      this.subCategory=[];
    });
  }
  proceedToTourPage(catSubId:number){
    this._router.navigate(['../tour'+'/'+catSubId]);
  }
  
}

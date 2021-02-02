import { ClassSansProvider, Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ClassCategorysub } from '../class-categorysub';
import { EtourService } from '../etour.service';

@Component({
  selector: 'app-category-sub',
  templateUrl: './category-sub.component.html',
  styleUrls: ['./category-sub.component.css']
})
export class CategorySubComponent implements OnInit {
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
    this._etourService.getCategorySubCategory(subCategory.categoryid).subscribe(
      data=>{
        this.subCategory=data;
        this.categorySub=[];
      });
  }

  fetchFurtherSubCategory(subCategory:ClassCategorysub){
    this._etourService.getCategorySubCategory(subCategory.categoryid).subscribe(data=>this.subCategory2=data);
  }
}

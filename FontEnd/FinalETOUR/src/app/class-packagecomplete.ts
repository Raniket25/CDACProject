import { ClassCategorysub } from "./class-categorysub";

export class ClassPackagecomplete {
    constructor(
       public packageid:Number,
        public tourname:String,
        public  tourimage:String,
        public catsubid:ClassCategorysub,
        public description:String
         ){}
}

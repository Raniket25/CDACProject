import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { EtourService } from '../etour.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  
  form: FormGroup = new FormGroup({
    customerName: new FormControl,
            email: new FormControl,
            password: new FormControl,
            customerAddress:new FormControl,
            city:new FormControl,
            state:new FormControl,
            pincode:new FormControl,
            mobile:new FormControl
  }
  );
    loading = false;
    submitted = false;

    constructor(
        private formBuilder: FormBuilder,
        private route: ActivatedRoute,
        private router: Router,
        private etourService: EtourService
    ) { }

    ngOnInit() {
        this.form = this.formBuilder.group({
          customerName: ['', Validators.required],
            email: ['', Validators.required],
            password: ['', [Validators.required, Validators.minLength(6)]],
            customerAddress:['',Validators.required],
            city:['',Validators.required],
            state:['',Validators.required],
            pincode:['',Validators.required],
            mobile:['',Validators.required]
        });
    }

    // changeGender(e) {
    //   this.form.Gender.setValue(e.target.value, {
    //     onlySelf: true
    //   })
    // }

    // convenience getter for easy access to form fields
    get f() { return this.form.controls; }

    onSubmit() {
        this.submitted = true;


        // stop here if form is invalid
        if (this.form.invalid) {
          console.log("Failed");
            return;
        }

        this.loading = true;
        this.etourService.registerUser(this.form.value).subscribe(
                data => {
                  console.log(data);
            this.router.navigate(['/success'], { relativeTo: this.route });
                },
                error => {
                    this.loading = false;
                });
    }

}

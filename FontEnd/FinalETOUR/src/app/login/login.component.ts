import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { EtourService } from '../etour.service';
import { UserRegistration } from '../user-registration';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  form: FormGroup = new FormGroup({
    email: new FormControl,
    passwordword: new FormControl
           
  }
  );
  login:UserRegistration;
  submitted = false;
  loading = false;


  constructor(
    private formBuilder: FormBuilder,
    private route: ActivatedRoute,
    private router: Router,
    private etourService: EtourService
) { }

  ngOnInit(): void {
    this.form = this.formBuilder.group({
    email: ['', Validators.required],
        password: ['', Validators.required],
        
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
        this.etourService.loginUser(this.form.controls.email.value).subscribe(
                data => {
                  console.log(data);
                  this.login = data;
                  if(this.login.password==this.form.controls.password.value){
            this.router.navigate(['../BookingDetails'], { relativeTo: this.route });
                }
              },
                error => {
                    this.loading = false;
                });
  }
 
}

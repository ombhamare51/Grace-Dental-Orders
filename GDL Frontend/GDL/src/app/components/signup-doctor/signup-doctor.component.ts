import { Component } from '@angular/core';

@Component({
  selector: 'app-signup-doctor',
  templateUrl: './signup-doctor.component.html',
  styleUrls: ['./signup-doctor.component.scss']
})
export class SignupDoctorComponent {
  doctor = {
    dr_name: '',
    clinic_name: '',
    email: '',
    password: '',
    confirm_password: ''
  };

  onSignup() {
    console.log('Doctor Signup Data:', this.doctor);
    // Add API call here
  }
}

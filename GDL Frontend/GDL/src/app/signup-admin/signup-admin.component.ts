import { Component } from '@angular/core';

@Component({
  selector: 'app-signup-admin',
  templateUrl: './signup-admin.component.html',
  styleUrls: ['./signup-admin.component.scss']
})
export class SignupAdminComponent {
  admin = {
    admin_id: '',
    admin_name: '',
    email: '',
    password: '',
    confirm_password: ''
  };

  onSignup() {
    console.log('Admin Signup Data:', this.admin);
    // Add API call here
  }
}

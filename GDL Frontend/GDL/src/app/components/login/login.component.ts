import { Component } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { SignupSelectionDialogComponent } from '../signup-selection-dialog/signup-selection-dialog.component';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {
  email = '';
  password = '';

  constructor(private dialog: MatDialog) {}

  onLogin() {
    if (this.email === 'test@example.com' && this.password === 'password') {
      alert('Login successful!');
    } else {
      alert('Invalid credentials. Try again.');
    }
  }

  openSignupDialog() {
    this.dialog.open(SignupSelectionDialogComponent, {
      width: '350px',
    });
  }
}

import { Component } from '@angular/core';
import { MatDialogRef } from '@angular/material/dialog';
import { Router } from '@angular/router';

@Component({
  selector: 'app-signup-selection-dialog',
  templateUrl: './signup-selection-dialog.component.html',
  styleUrls: ['./signup-selection-dialog.component.scss']
})
export class SignupSelectionDialogComponent {
  constructor(private dialogRef: MatDialogRef<SignupSelectionDialogComponent>, private router: Router) {}

  selectDoctor() {
    this.dialogRef.close();
    this.router.navigate(['/signup-doctor']);
  }

  selectAdmin() {
    this.dialogRef.close();
    this.router.navigate(['/signup-admin']);
  }
}

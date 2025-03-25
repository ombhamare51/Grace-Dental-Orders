import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SignupSelectionDialogComponent } from './signup-selection-dialog.component';

describe('SignupSelectionDialogComponent', () => {
  let component: SignupSelectionDialogComponent;
  let fixture: ComponentFixture<SignupSelectionDialogComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SignupSelectionDialogComponent]
    });
    fixture = TestBed.createComponent(SignupSelectionDialogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

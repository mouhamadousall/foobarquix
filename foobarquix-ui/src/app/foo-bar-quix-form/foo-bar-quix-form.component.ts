import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { FooBarQuixService } from '../foo-bar-quix.service';

@Component({
  selector: 'app-foo-bar-quix-form',
  templateUrl: './foo-bar-quix-form.component.html'
})
export class FooBarQuixFormComponent implements OnInit {
  @Output() submitNumberOutput = new EventEmitter<number>();;

  form: FormGroup;
  fooBarQuixService: FooBarQuixService;
  constructor(fooBarQuixService: FooBarQuixService) {
    this.fooBarQuixService = fooBarQuixService;
  }

  ngOnInit(): void {
    this.form = new FormGroup({
      inputNumber: new FormControl('', Validators.compose([])),
    });
  }


  submitNumber(): void {
    this.submitNumberOutput.emit(this.form.value.inputNumber);
  }

}

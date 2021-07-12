import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { FooBarQuixService } from '../foo-bar-quix.service';

@Component({
  selector: 'app-foo-bar-quix',
  templateUrl: './foo-bar-quix.component.html'
})
export class FooBarQuixComponent implements OnInit, OnDestroy {

  numberAndResults: NumberConverted[];

  constructor(private fooBarQuixService: FooBarQuixService) { }

  ngOnInit(): void {
    this.numberAndResults = [];
  }

  ngOnDestroy(): void {
    this.numberAndResults = [];
  }

  convertNumber(inputNumber: number): void {
    this.fooBarQuixService.getValues(inputNumber).subscribe(result => this.numberAndResults.push({ numberToConvert: inputNumber, result }));
  }

}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}

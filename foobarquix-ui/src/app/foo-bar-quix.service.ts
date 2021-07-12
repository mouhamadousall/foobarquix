import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FooBarQuixService {
  configUrl = 'http://localhost:8080';
  numberToConvert: number;
  http: HttpClient
  constructor(http: HttpClient) {
    this.http = http;
  }

  getValues(inputNumber: number): Observable<any> {
    return this.http.get<any>(`${this.configUrl}/foo-bar-quix/${inputNumber}`)
  }
}

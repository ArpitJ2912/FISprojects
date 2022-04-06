import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MyServiceService {

  constructor() { }

  todayDate(){
    let ndate = new Date();
    return ndate;
  }
}

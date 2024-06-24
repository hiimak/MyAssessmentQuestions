import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor() { }

  getProduct(){

    return {"title" : "Staubsauger", "price" : 30, "currency": "CHF", "desc": "A cheap and useless vaccuum."}
  }
}

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class StockService {

  constructor(private http : HttpClient) { }

  getProduct(name : string) : Observable<any>{
    return this.http.get(`http://localhost:8080/findbyname?name=${name}`);
  }

  postAddProduct(data) : Observable<any>{
    return this.http.post(`http://localhost:8080/addproduct`,data);
  }

  updateproduct(id:number,name :string,category:string,company:string,quantity:number,price:number){
    return this.http.put(`http://localhost:8080/updateproduct?id=${id}&name=${name}&category=${category}&company=${company}&quantity=${quantity}&price=${price}`,1);
  }
}

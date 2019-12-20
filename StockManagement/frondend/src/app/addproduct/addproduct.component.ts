import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { StockService } from '../stock.service';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {
form;
  constructor(private service : StockService) { }

  get name(){
    return this.form.get('name')
  }

  get category(){
    return this.form.get('category')
  }

  get company(){
    return this.form.get('category');
  }

  get quantity(){
    return this.form.get('quantity');
  }

  get price(){
    return this.form.get('price');
  }

  ngOnInit() {
    this.form = new FormGroup({
      name : new FormControl('',[ Validators.required]),
      category :new FormControl('',[ Validators.required]),
      company :new FormControl('',[ Validators.required]),
      quantity :new FormControl('',[ Validators.required]),
      price :new FormControl('',[ Validators.required])
    })
  }

  addproduct(form){
    console.log(form.value);
    this.service.postAddProduct(form.value).subscribe(data=>{
      if(data && data.statusCode === 201){
        console.log("hello",data);
        console.log('data added successfully');
      }
    })
  }
}

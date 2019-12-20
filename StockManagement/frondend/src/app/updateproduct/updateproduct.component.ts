import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { StockService } from '../stock.service';

@Component({
  selector: 'app-updateproduct',
  templateUrl: './updateproduct.component.html',
  styleUrls: ['./updateproduct.component.css']
})
export class UpdateproductComponent implements OnInit {

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

  get product_id(){
    return this.form.get('product_id');
  }

  ngOnInit() {
    this.form = new FormGroup({
      product_id :  new FormControl('',[ Validators.required]),
      name : new FormControl('',[ Validators.required]),
      category :new FormControl('',[ Validators.required]),
      company :new FormControl('',[ Validators.required]),
      quantity :new FormControl('',[ Validators.required]),
      price :new FormControl('',[ Validators.required])
    })
  }

  updateproduct(form){
    console.log(form.value);
    this.service.updateproduct(form.value.product_id,form.value.name,form.value.category,form.value.company,form.value.quantity,form.value.price).subscribe(data=>{
      console.log(data);
    })
  }

}

import { Component, OnInit } from '@angular/core';
import { NgModule} from '@angular/core';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { StockService } from '../stock.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

product;
  constructor(private service : StockService) { }

  ngOnInit() {
  }
  productsearch(form){
    console.log(form.value.name);
    this.service.getProduct(form.value.name).subscribe(data => {
      console.log(data.product);
      this.product = data.product;
    })
  }
}

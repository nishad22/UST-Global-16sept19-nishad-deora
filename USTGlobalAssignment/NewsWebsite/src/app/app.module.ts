import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { NavbarComponent } from './navbar/navbar.component';
import { CountriesComponent } from './countries/countries.component';
import { IndianewsComponent } from './indianews/indianews.component';
import { CategoriesComponent } from './categories/categories.component';
import { ChildcategoriesComponent } from './childcategories/childcategories.component';
import { SourceComponent } from './source/source.component';
import { ChlidsourceComponent } from './source/chlidsource/chlidsource.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    NavbarComponent,
    CountriesComponent,
    IndianewsComponent,
    CategoriesComponent,
    ChildcategoriesComponent,
    SourceComponent,
    ChlidsourceComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,  
    RouterModule.forRoot([
      {path : 'navbar' , component : NavbarComponent},
      {path : '', component : HomeComponent},
      {path : 'countries', component : CountriesComponent},
      {path : 'categories', component : CategoriesComponent},
      {path : 'source', component : SourceComponent}

    ]) 

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

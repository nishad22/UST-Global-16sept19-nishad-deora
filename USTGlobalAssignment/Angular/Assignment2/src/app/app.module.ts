import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { CarComponent } from './product/car/car.component';
import { BikesComponent } from './product/bikes/bikes.component';
import { RouterModule } from '@angular/router';
import { ProinputComponent } from './proinput/proinput.component';
import { ProcarComponent } from './procar/procar.component';
import { PromoviesComponent } from './promovies/promovies.component';
import { ProlapComponent } from './prolap/prolap.component';
import { PromobComponent } from './promob/promob.component';
import { MoviesComponent } from './product/movies/movies.component';
import { LaptopComponent } from './product/laptop/laptop.component';
import { MobileComponent } from './product/mobile/mobile.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    CarComponent,
    BikesComponent,
    ProinputComponent,
    ProcarComponent,
    PromoviesComponent,
    ProlapComponent,
    PromobComponent,
    MoviesComponent,
    LaptopComponent,
    MobileComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot([
      {path : 'bikes' , component : BikesComponent},
      {path : 'car' , component : CarComponent},
      {path : 'movies' , component : MoviesComponent},
      {path : 'laptop' , component : LaptopComponent},
      {path : 'mobile' , component : MobileComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

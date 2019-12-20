import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RouterModule } from '@angular/router';
import { NavbarComponent } from './navbar/navbar.component';
import { RegisterComponent } from './register/register.component';
import { StudentregisterComponent } from './register/studentregister/studentregister.component';
import { LibrerianregisterComponent } from './register/librerianregister/librerianregister.component';
import { LoginComponent } from './login/login.component';
import { LoginstudentComponent } from './login/loginstudent/loginstudent.component';
import { HomeComponent } from './home/home.component';
import { StudenthomeComponent } from './home/studenthome/studenthome.component';
import { LoginlibrerianComponent } from './loginlibrerian/loginlibrerian.component';
import { LibrerianhomeComponent } from './home/librerianhome/librerianhome.component';
import { AddbookComponent } from './addbook/addbook.component';
import { ResponseComponent } from './response/response.component';




@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    RegisterComponent,
    StudentregisterComponent,
    LibrerianregisterComponent,
    LoginComponent,
    LoginstudentComponent,
    HomeComponent,
    StudenthomeComponent,
    LoginlibrerianComponent,
    LibrerianhomeComponent,
    AddbookComponent,
    ResponseComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      {path : 'register' , component : RegisterComponent},
      {path : 'studentregister' , component : StudentregisterComponent},
      {path : 'librerianregister' , component : LibrerianregisterComponent},
      {path : 'login' , component : LoginComponent},
      {path : 'loginstudent' , component : LoginstudentComponent},
      {path : 'loginlibrerian' , component : LoginlibrerianComponent},
      {path : 'studenthome' , component : StudenthomeComponent},
      {path : 'librerianhome' , component : LibrerianhomeComponent},
      {path : 'addbook' , component : AddbookComponent},
      {path : 'response' , component : ResponseComponent}
  ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

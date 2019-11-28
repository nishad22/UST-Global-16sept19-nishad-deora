import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { RouterModule } from '@angular/router';
import { FormComponent } from './form/form.component';
import { CompanydetailComponent } from './form/companydetail/companydetail.component';
import { CandidatedetailComponent } from './form/candidatedetail/candidatedetail.component';
import { UserdetailComponent } from './form/userdetail/userdetail.component';
import { ProductdetailComponent } from './form/productdetail/productdetail.component';
import { AboutchildComponent } from './aboutchild/aboutchild.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    LoginComponent,
    RegisterComponent,
    CompanydetailComponent,
    FormComponent,
    CandidatedetailComponent,
    UserdetailComponent,
    ProductdetailComponent,
    AboutchildComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot([
      {path : 'home' , component : HomeComponent},
      {path : 'about' , component : AboutComponent},
      {path : 'help' , component : HelpComponent},
      {path : 'login' , component : LoginComponent},
      {path : 'register' , component : RegisterComponent},
      {path : 'companydetail' ,component : CompanydetailComponent },
      {path : 'candidatedetail' ,component : CandidatedetailComponent },
      {path : 'productdetail' ,component : ProductdetailComponent},
      {path : 'userdetail' ,component : UserdetailComponent,}
  ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

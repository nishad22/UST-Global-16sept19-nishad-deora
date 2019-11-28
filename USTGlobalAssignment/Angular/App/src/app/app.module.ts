import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { NavbarComponent } from './navbar/navbar.component';
import { HomeComponent } from './home/home.component';
import { RouterModule } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { FooterComponent } from './footer/footer.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
import { TwoWayBindingComponent } from './data-binding/two-way-binding/two-way-binding.component';
import { NgIfComponent } from './data-binding/ng-if/ng-if.component';
import { NgforComponent } from './data-binding/ngfor/ngfor.component';
import { NgSwitchComponent } from './data-binding/ng-switch/ng-switch.component';
import { CustomDirective } from './custome.directive';
import { RegisterComponent } from './register/register.component';
import { ReactiveformComponent } from './reactiveform/reactiveform.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { DollarpipePipe } from './dollarpipe.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    NavbarComponent,
    HomeComponent,
    AboutComponent,
    FooterComponent,
    DataBindingComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwoWayBindingComponent,
    NgIfComponent,
    NgforComponent,
    NgSwitchComponent,
    CustomDirective,
    RegisterComponent,
    ReactiveformComponent,
    ParentComponent,
    ChildComponent,
    CommentComponent,
    CommentDetailsComponent,
    DollarpipePipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : 'home', component : HomeComponent},
      {path : 'about', component : AboutComponent},
      {path : 'property-binding', component : PropertyBindingComponent},
      {path : 'event-binding', component : EventBindingComponent},
      {path : 'two-way-binding', component : TwoWayBindingComponent},
      {path : 'ng-if', component : NgIfComponent },
      {path : 'ngfor', component : NgforComponent},
      {path : 'ng-switch', component: NgSwitchComponent},
      {path : 'register', component : RegisterComponent },
      {path : 'reactiveform' , component : ReactiveformComponent},
      {path : 'parent' ,component : ParentComponent},
      {path : 'comment-details', component : CommentDetailsComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

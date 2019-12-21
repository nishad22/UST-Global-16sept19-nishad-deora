import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http:HttpClient) { }

  //login

  loginData(form):Observable<any>{
   return this.http.post<any>(`http://localhost:8080/login`,form);
  }
  

  //register

  registerUser(form):Observable<any>{
    return this.http.post<any>(`http://localhost:8080/register`,form);
  }

  //forgotpassword
  forgotPassword(form){
    return this.http.post<any>(`http://localhost:8080`,form);
  }


  //changePassword
  changePassword(form):Observable<any>{
    return this.http.post<any>('http://localhost:8080',form);
  }

  //compose
  composeEmail(data):Observable<any>{
    return this.http.get<any>(`http://localhost:8080`,data);

  }

  //draftmail
  adddraftMail(form,email){
    return this.http.post<any>(`http://localhost:8080`,form,email);
  }

//inbox
inbox():Observable<any>{
  return this.http.get<any>("http://localhost:8080");
}
//delete email
deleteEmail(form):Observable<any>{
return this.http.get<any>(`http://localhost:8080//${form.id}`);
}
//sent mail
sentMail():Observable<any>{
return this.http.get<any>(`http://localhost:8080/`);
}

//draft mail
draftMail():Observable<any>{
  return this.http.get<any>(`http://localhost:8080/`);
  }


}

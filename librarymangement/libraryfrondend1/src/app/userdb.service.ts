import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { map } from 'rxjs/operators';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserdbService {


  constructor(private http: HttpClient) { }

  postStudent(data) {
    return this.http.post(`http://localhost:8080/libraryspringrest/registerstud`, data);
  }

  postLibrarian(data) {
    return this.http.post(`http://localhost:8080/libraryspringrest/registerlib`, data);
  }

  postLoginStudent(rollno: string, password: string): Observable<any> {
    return this.http.post(`http://localhost:8080/libraryspringrest/loginstud?id=${rollno}&password=${password}`, 1);
  }

  postLoginLibrerian(libid : string, password : string): Observable<any> {
    return this.http.post(`http://localhost:8080/libraryspringrest/loginlib?id=${libid}&password=${password}`, 1);
  }

  searchBook(search: number): Observable<any> {
    return this.http.get(`http://localhost:8080/libraryspringrest/searchbook?id=${search}`);
  }

  updateBook(bid: number, bname: string , bauthor: string, publication: string) {
    // tslint:disable-next-line: max-line-length
    return this.http.put(`http://localhost:8080/libraryspringrest/updatebook?id=${bid}&bname=${bname}&bauthor=${bauthor}&publication=${publication}`, 1);
  }

  postAddBook(data): Observable<any>{
    return this.http.post(`http://localhost:8080/libraryspringrest/addbook`,data);
  }

  postRequestBook(rollno: string, bid: number) : Observable<any>{
    return this.http.post(`http://localhost:8080/libraryspringrest/request?sid=${rollno}&id=${bid}`, 1);
  }

  getAllRequest(): Observable<any> {
    return this.http.get(`http://localhost:8080/libraryspringrest/bookissue`);
  }
    //   .pipe(map(data => {let bookissue = [];
    //   for(let key in data) {
    //     bookissue.push({...data, id : key});
    //   }
    //   return bookissue
    // })
    // );
  

  acceptRequest(id: number): Observable<any> {
    return this.http.post(`http://localhost:8080/libraryspringrest/respond?id=${id}`, 1);
  }

  rejectRequest(id : number): Observable<any> {
    return this.http.delete(`http://localhost:8080/libraryspringrest/deleterespond?id=${id}`);
  }
}

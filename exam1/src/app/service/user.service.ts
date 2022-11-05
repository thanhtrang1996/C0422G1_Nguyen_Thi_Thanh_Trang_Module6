import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http :HttpClient) { }

  getAllSearchPage(page:number,search:string):Observable<any>{
    return this.http.get(`http://localhost:8080/api/public/searchPage?page=${page}`+`&name=${search}`)
  }
}

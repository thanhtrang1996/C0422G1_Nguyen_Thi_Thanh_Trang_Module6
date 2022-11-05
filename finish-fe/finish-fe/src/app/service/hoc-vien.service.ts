import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {HocVien} from '../model/hocVien';

@Injectable({
  providedIn: 'root'
})
export class HocVienService {

  constructor(private http:HttpClient) { }
  getAllPage(page:number,name:string):Observable<any>{
    return this.http.get(`http://localhost:8080/hocVien/page?page=${page}`+`&name=${name}`)
  }
  getAllTop():Observable<any>{
    return this.http.get(`http://localhost:8080/hocVien/listTop`)
  }
  add(hocVien:HocVien):Observable<any>{
    return this.http.post(`http://localhost:8080/hocVien/create`,hocVien);
  }
  detail(id:number):Observable<any>{
    return this.http.delete(`http://localhost:8080/hocVien/detail/${id}`)
  }

}


import {Lop} from './lop';
import {Thuong} from './thuong';
import {Phat} from './phat';

export interface HocVien {
  id?:number;
  ten?:string;
  ngaySinh?:string;
  email?:string;
  cCCD?:string;
  soDienThoai?:string;
  lop ?:Lop;
  thuong?:Thuong;
  phat?:Phat;

}

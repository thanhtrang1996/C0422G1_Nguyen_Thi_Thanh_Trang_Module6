import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {ToastrService} from 'ngx-toastr';
import {Router} from '@angular/router';
import {Lop} from '../../model/lop';
import {Thuong} from '../../model/thuong';
import {Phat} from '../../model/phat';
import {HocVienService} from '../../service/hoc-vien.service';
import {LopService} from '../../service/lop.service';
import {ThuongService} from '../../service/thuong.service';
import {PhatService} from '../../service/phat.service';


@Component({
  selector: 'app-tao-moi',
  templateUrl: './tao-moi.component.html',
  styleUrls: ['./tao-moi.component.css']
})
export class TaoMoiComponent implements OnInit {
  hocVienForm: FormGroup;
  lopList: Lop[] = [];


  constructor(private hocVienService: HocVienService,
              private lopService: LopService,
              private toart: ToastrService,
              private router :Router) {
    this.lopService.getAll().subscribe(data => {
      this.lopList = data;
    })
  }

  ngOnInit(): void {
    this.createForm()
  }

  createForm() {
    this.hocVienForm = new FormGroup({
      ten: new FormControl('',[Validators.required]),
      ngaySinh: new FormControl('',[Validators.required]),
      email: new FormControl('',[Validators.required, Validators.email]),
      soDienThoai: new FormControl('',[Validators.required, Validators.pattern('^(090|091|(84+)90|(84+)91)[0-9]{6}$')]),
      cCCD: new FormControl('',[Validators.required]),
      lop: new FormGroup({
        id: new FormControl('',[Validators.required])
      })
    })
  }

  submit() {
    if (this.hocVienForm.valid){
      const hocVien = this.hocVienForm.value;
      this.hocVienService.add(hocVien).subscribe(next=>{
        this.router.navigateByUrl('').then(()=>{
          this.toart.success("Tạo mới thành công")
        })
      },error => {
        console.log(error);
      });

    }else {
      this.toart.warning("Phải nhập đúng định dạng");
    }
  }
  get email() {
    return this.hocVienForm.get('email');
  }

  get soDienThoai() {
    return this.hocVienForm.get('soDienThoai');
  }

}

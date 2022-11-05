import {Component, OnInit} from '@angular/core';
import {ToastrService} from 'ngx-toastr';
import {HocVienService} from '../../service/hoc-vien.service';
import {HocVien} from '../../model/hocVien';
import {Lop} from '../../model/lop';
import {LopService} from '../../service/lop.service';
import {ThuongService} from '../../service/thuong.service';
import {PhatService} from '../../service/phat.service';
import {Thuong} from '../../model/thuong';
import {Phat} from '../../model/phat';

@Component({
  selector: 'app-hoc-vien',
  templateUrl: './hoc-vien.component.html',
  styleUrls: ['./hoc-vien.component.css']
})
export class HocVienComponent implements OnInit {
  page: number = 0;
  name: string = "";
  hocVien: HocVien[] = [];
  lop: Lop[] = [];
  totalPages: number;
  hocVien1: HocVien;
  thuongList: Thuong[] = [];
  phatList: Phat[] = [];

  constructor(private hocVienService: HocVienService,
              private toart: ToastrService,
              private lopService: LopService,
              private thuongService: ThuongService,
              private phatService: PhatService,) {
    this.lopService.getAll().subscribe(data => {
      this.lop = data;
    })
    this.thuongService.getAll().subscribe(data => {
      this.thuongList = data;
    })
    this.phatService.getAll().subscribe(data => {
      this.phatList = data;
    })

  }

  ngOnInit(): void {
    this.getAllPage();

  }

  getAllPage() {
    this.hocVienService.getAllPage(this.page, this.name).subscribe(data => {
      this.hocVien = data.content;
      this.totalPages = data.totalPages;

    })
  }

  nextPage() {
    if (this.page < this.totalPages) {
      this.page++;
    }
    this.getAllPage();
  }

  previousPage() {
    if (this.page > 0) {
      this.page--;
    }
    this.getAllPage();
  }

  getInfoToModal(hocVien: HocVien) {
    this.hocVien1 = hocVien;
  }

  detailHocVien(id: number) {
    this.hocVienService.detail(id).subscribe(next => {
    });
  }

  search() {
    //   if (name ==""){
    //     this.getAllPage()
    //   }else {
    //     this.hocVienService.getAllPage(this.page, this.name).subscribe(data => {
    //       this.hocVien = data.content;
    //       this.totalPages = data.totalPages;
    //
    //     })
    //   }
    // }
  }
}

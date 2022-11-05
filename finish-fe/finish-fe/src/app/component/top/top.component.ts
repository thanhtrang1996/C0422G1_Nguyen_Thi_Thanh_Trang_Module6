import { Component, OnInit } from '@angular/core';
import {HocVienService} from '../../service/hoc-vien.service';
import {HocVien} from '../../model/hocVien';
import {PhatService} from '../../service/phat.service';
import {Phat} from '../../model/phat';

@Component({
  selector: 'app-top',
  templateUrl: './top.component.html',
  styleUrls: ['./top.component.css']
})
export class TopComponent implements OnInit {
  hocVien: HocVien[] = [];
  phatList: Phat[] = [];
  constructor(private hocVienService: HocVienService,
              private phatService: PhatService) {
    this.phatService.getAll().subscribe(data => {
      this.phatList = data;
    })
  }

  ngOnInit(): void {
    this.hocVienService.getAllTop().subscribe(data=>{
      this.hocVien = data;
    })
  }

}

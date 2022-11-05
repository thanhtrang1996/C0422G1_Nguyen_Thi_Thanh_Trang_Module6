import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {User} from "../../model/user";
import {UserService} from "../../service/user.service";


@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {
  @Output()keySearch = new EventEmitter();
  user :User[] =[];
  constructor(private userService : UserService) { }

  ngOnInit(): void {
    this.userService.getAllSearchPage(0,"").subscribe(data=>{
      this.user =data.content;
    })
  }
  search(page:number,name: string) {
    this.keySearch.emit(name) ;
  }

}

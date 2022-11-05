import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {UserService} from "../../service/user.service";
import {User} from "../../model/user";
import {Router} from "@angular/router";

@Component({
  selector: 'app-home1',
  templateUrl: './home1.component.html',
  styleUrls: ['./home1.component.css']
})
export class Home1Component implements OnInit {
  user: User[] = [];
  constructor(private userService: UserService,private router :Router) {
  }

  ngOnInit() {
  }

  search(page:number,name: string) {
    this.userService.getAllSearchPage(0,name).subscribe(data => {
      this.user = data.content;
      this.router.navigateByUrl("/list")
    })
  }
}

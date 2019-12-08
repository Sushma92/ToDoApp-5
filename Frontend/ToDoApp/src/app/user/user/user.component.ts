import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/common/entity/user';
import { UserService } from 'src/app/common/service/user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  users : User[];
  
  constructor(private userService : UserService) { }

  ngOnInit() {
    this.userService.getAll().subscribe(data => { this.users = data; });
  }

}

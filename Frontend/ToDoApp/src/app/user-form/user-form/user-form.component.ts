import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/common/entity/user';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from 'src/app/common/service/user.service';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent implements OnInit {

  user: User;
  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private userService: UserService
  ) {
    this.user = new User();
   }

  ngOnInit() {
  }

  onSubmit(){
    this.userService.save(this.user).subscribe(result => this.gotoUsersList());
  }

  gotoUsersList(){
    this.router.navigate(['/users']);
  }

}

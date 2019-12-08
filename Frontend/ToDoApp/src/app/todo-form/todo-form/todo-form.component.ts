import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/common/entity/todo';
import { ActivatedRoute, Router } from '@angular/router';
import { TodoService } from 'src/app/common/service/todo.service';
import { User } from 'src/app/common/entity/user';
import { Project } from 'src/app/common/entity/project';
import { UserService } from 'src/app/common/service/user.service';
import { ProjectService } from 'src/app/common/service/project.service';

@Component({
  selector: 'app-todo-form',
  templateUrl: './todo-form.component.html',
  styleUrls: ['./todo-form.component.css']
})
export class TodoFormComponent implements OnInit {

  todo: Todo;
  users: User[];
  projects: Project[];

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private todoService: TodoService,
    private userService: UserService,
    private projectService: ProjectService
  ) {
    this.todo = new Todo();
   }

  ngOnInit() {
    this.userService.getAll().subscribe(data => { this.users = data; });
    this.projectService.getAll().subscribe(data => { this.projects = data; });
  }

  onSubmit(){
    this.todoService.save(this.todo).subscribe(result => this.gotoTodoList());

  }

  gotoTodoList(){
    this.router.navigate(['/todos'])
  }

}

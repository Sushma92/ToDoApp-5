import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/common/entity/todo';
import { TodoService } from 'src/app/common/service/todo.service';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {

  todos : Todo[];
  constructor(private todoService: TodoService) { }

  ngOnInit() {
    this.todoService.getAll().subscribe(data => { this.todos = data; });
  }

}

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Todo } from '../entity/todo';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TodoService {

  private todoUrl: string; 

  constructor(private http: HttpClient) {
    this.todoUrl = 'http://localhost:7000/api/services/todo/todo'
   }

   public save(project: Todo){
     return this.http.post<Todo>(this.todoUrl + '/create', project);
   }

   public getAll(): Observable<Todo[]>{
     return this.http.get<Todo[]>(this.todoUrl + '/fetchAll');
   }
}

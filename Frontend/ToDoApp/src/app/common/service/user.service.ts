import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../entity/user';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private usersUrl: string;

  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:7000/api/services/todo/user';
   }

   public save(user: User){
     return this.http.post<User>(this.usersUrl + '/create', user);
   }

   public getAll(): Observable<User[]>{
     return this.http.get<User[]>(this.usersUrl + '/fetchAll');
   }
}

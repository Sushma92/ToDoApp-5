import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Project } from '../entity/project';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProjectService {

  private projectsUrl: string;

  constructor(private http: HttpClient) {
    this.projectsUrl = 'http://localhost:7000/api/services/todo/projects';
   }

   public save(project : Project){
     return this.http.post<Project>(this.projectsUrl + '/projects', project);
   }

   public getAll(): Observable<Project[]>{
     return this.http.get<Project[]>(this.projectsUrl + 'fetchAll');
   }
}

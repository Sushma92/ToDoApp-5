import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProjectComponent } from './project/project/project.component';
import { UserComponent } from './user/user/user.component';
import { TodoComponent } from './todo/todo/todo.component';
import { UserFormComponent } from './user-form/user-form/user-form.component';
import { TodoFormComponent } from './todo-form/todo-form/todo-form.component';
import { ProjectFormComponent } from './project-form/project-form/project-form.component';

const routes: Routes = [
  {path: 'projects', component: ProjectComponent},
  {path: 'users', component: UserComponent},
  {path: 'todos', component: TodoComponent},
  {path: 'create-user', component: UserFormComponent},
  {path: 'create-todo', component: TodoFormComponent},
  {path: 'create-project', component: ProjectFormComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

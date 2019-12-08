import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MainComponent } from './common/layout/main/main.component';
import { HeaderComponent } from './common/layout/header/header.component';
import { FooterComponent } from './common/layout/footer/footer.component';
import { UserFormComponent } from './user-form/user-form/user-form.component';
import { TodoComponent } from './todo/todo/todo.component';
import { TodoFormComponent } from './todo-form/todo-form/todo-form.component';
import { ProjectComponent } from './project/project/project.component';
import { ProjectFormComponent } from './project-form/project-form/project-form.component';
import { UserComponent } from './user/user/user.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    MainComponent,
    HeaderComponent,
    FooterComponent,
    UserFormComponent,
    TodoComponent,
    TodoFormComponent,
    ProjectComponent,
    ProjectFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

import { Component, OnInit } from '@angular/core';
import { Project } from 'src/app/common/entity/project';
import { ProjectService } from 'src/app/common/service/project.service';

@Component({
  selector: 'app-project',
  templateUrl: './project.component.html',
  styleUrls: ['./project.component.css']
})
export class ProjectComponent implements OnInit {

  projects: Project[];

  constructor(private projectService: ProjectService) { }

  ngOnInit() {
    this.projectService.getAll().subscribe(data => { this.projects = data; });
  }

}

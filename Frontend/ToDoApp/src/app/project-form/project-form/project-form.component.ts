import { Component, OnInit } from '@angular/core';
import { Project } from 'src/app/common/entity/project';
import { Router, ActivatedRoute } from '@angular/router';
import { ProjectService } from 'src/app/common/service/project.service';

@Component({
  selector: 'app-project-form',
  templateUrl: './project-form.component.html',
  styleUrls: ['./project-form.component.css']
})
export class ProjectFormComponent implements OnInit {

  project : Project;

  constructor(
    private router: Router,
    private route: ActivatedRoute,
    private projectService: ProjectService
  ) {
    this.project = new Project();
   }

  ngOnInit() {
  }

  onSubmit(){
    this.projectService.save(this.project).subscribe(result => this.gotoProjectList());
  }

  gotoProjectList(){
    this.router.navigate(['/projects']);
  }

}

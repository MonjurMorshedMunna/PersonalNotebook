/**
 * Created by monju on 12-Dec-16.
 */

import {Component, OnInit} from "@angular/core";
import {SubjectService} from "../services/subject.service";
import {Subject} from "../models/Subject";
@Component({
  selector:'app-subject',
  templateUrl:'app/views/subject.component.html'
})

export class SubjectComponent implements OnInit{

  subjects:Subject[];

  constructor(private subjectService: SubjectService){

  }

  private getAllSubjects():void{
   this.subjectService
     .getSubjects()
     .then(subjects => this.subjects = subjects);
  }

  ngOnInit():void{
    this.getAllSubjects();
    console.log(this.subjects);
  }
}

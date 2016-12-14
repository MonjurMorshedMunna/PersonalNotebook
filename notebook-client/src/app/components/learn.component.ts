
import {Component, OnInit} from "@angular/core";
import {Topics} from "../models/Topics";
import {Subject} from "../models/Subject";
import {SubjectService} from "../services/subject.service";
import {LearnService} from "../services/learn.service";
@Component({
  selector:'app-learn',
  templateUrl:'app/views/learn.component.html'
})

export class LearnComponent implements OnInit{

  subjects:Array<Subject>;
  topics:Array<Topics>;
  selectedSubject:Subject;

  constructor(private subjectService: SubjectService,
              private learnService: LearnService){

  }

  private getAllSubjects():void{
    this.subjectService
      .getSubjects()
      .then(subjects=>{
        this.subjects=[];
        this.subjects = subjects;
        console.log("subjects");
        console.log(this.subjects);
      });
  }

  ngOnInit():void{
    this.getAllSubjects();
  }

  fetchTopics(selectedSubject:Subject){

  }

}

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

  subjects:Array<Subject>;
  showAddArea:boolean = false;
  addedSubject:string;
  showSpinner:boolean=false;

  constructor(private subjectService: SubjectService){

  }

  private getAllSubjects():void{
    this.showSpinner=true;
   this.subjectService
     .getSubjects()
     .then(subjects => {
       this.showSpinner=false;
       this.subjects=[];
       this.subjects=subjects;
       console.log(this.subjects);
     });
  }

  ngOnInit():void{
    this.getAllSubjects();
  }

  addNewSubject():void{
    this.showAddArea=true;
  }

  addSubject(addedSubject:string):void{
    console.log("Added  subject");
    console.log(addedSubject);
    var subject:Subject = <Subject>{};
    subject.subjectName= addedSubject;
    subject.isAdded=true;

    this.subjects.push(subject);

    this.addedSubject="";
  }

  enableEdit(subject:Subject):void{
    subject.edit=true;
    subject.isUpdated=true;
  }

  save():void{
    this.showSpinner=true;
    this.subjectService.saveSubjects(this.subjects).then((message:any)=>{
      this.showSpinner=false;
      this.getAllSubjects();
    });
  }

  delete(subject:Subject):void{
    this.subjectService.deleteASubject(subject).then((message:any)=>{
      var index:number = this.subjects.indexOf(subject);
      this.subjects.splice(index,1);
    });
  }
}

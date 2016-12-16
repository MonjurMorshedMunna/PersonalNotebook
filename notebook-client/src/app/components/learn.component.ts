
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
  showAddPortion:boolean=false;
  newTopics:Topics;

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
    console.log("Selected subject");
    console.log(this.selectedSubject);
    this.learnService.getTopics(this.selectedSubject).then((topics:Array<Topics>)=>{
      console.log("===topics====");
      console.log(topics);
      this.topics=[];
      this.topics = topics;
      for(var i=0;i<this.topics.length;i++){
        this.topics[i].showAnswer=false;
      }
    });
  }

  addATopic(){
    this.showAddPortion=true;
    this.newTopics= <Topics>{};
  }

  saveNewTopic(){
    this.newTopics.subjectId=this.selectedSubject.id;
    this.learnService.saveTopics(this.newTopics).then((response)=>{
      this.fetchTopics(this.selectedSubject);
      this.showAddPortion=false;
    });
  }

  showAnswer(topic:Topics){
    topic.showAnswer=true;
  }

  hideAnswer(topic:Topics){
    topic.showAnswer=false;
  }

}

import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app working!';
  home:string="";
  subject:string="";
  learn:string="";

  makeActive(type:string){
    if(type=='home'){
      this.home='active';
      this.subject='';
      this.learn='';
    }
    else if(type=='subject'){
      this.subject='active';
      this.home='';
      this.learn='';
    }
    else{
      this.learn='active';
      this.subject='';
      this.home='';
    }
  }

}

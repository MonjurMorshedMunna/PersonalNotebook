import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import {AppRoutingModule} from "./app-routing.module";
import {HomeComponent} from "./components/home.component";
import {LearnComponent} from "./components/learn.component";
import {RevisionComponent} from "./components/revision.component";
import {SubjectComponent} from "./components/subject.component";
import {SubjectService} from "./services/subject.service";

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LearnComponent,
    RevisionComponent,
    SubjectComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    AppRoutingModule
  ],
  providers: [SubjectService],
  bootstrap: [AppComponent]
})
export class AppModule { }

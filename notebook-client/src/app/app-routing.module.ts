import {Routes, RouterModule} from "@angular/router";
import {HomeComponent} from "./components/home.component";
import {LearnComponent} from "./components/learn.component";
import {RevisionComponent} from "./components/revision.component";
import {SubjectComponent} from "./components/subject.component";
import {NgModule} from "@angular/core";
/**
 * Created by monju on 12-Dec-16.
 */

const routes:Routes=[
  {path:'', redirectTo:'/home', pathMatch:'full'},
  {path:'home', component: HomeComponent},
  {path:'learn', component: LearnComponent},
  {path:'revision', component: RevisionComponent},
  {path:'subject', component: SubjectComponent}
];

@NgModule({
  imports:[RouterModule.forRoot(routes)],
  exports:[RouterModule]
})

export class AppRoutingModule{

}

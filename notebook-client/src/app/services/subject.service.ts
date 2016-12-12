/**
 * Created by monju on 13-Dec-16.
 */

import {Injectable} from "@angular/core";
import {Subject} from "../models/Subject";
import {Http, Headers} from "@angular/http";
import 'rxjs/add/operator/toPromise';

@Injectable()
export class SubjectService{
   private url:string = "http://localhost:8080/subject/";
  private headers = new Headers({'Content-Type': 'application/json'});

   constructor(private http:Http){

   }

   public getSubjects(): Promise<Subject[]>{
     return this.http.get(this.url+'/all')
       .toPromise()
       .then(response=>response.json().data as Subject[])
       .catch(this.handleError);
   }

  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error); // for demo purposes only
    return Promise.reject(error.message || error);
  }
}

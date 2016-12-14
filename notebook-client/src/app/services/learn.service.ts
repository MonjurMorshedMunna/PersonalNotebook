/**
 * Created by monju on 14-Dec-16.
 */

import {Injectable} from "@angular/core";
import {Http, Headers} from "@angular/http";
import {Topics} from "../models/Topics";
import {Subject} from "../models/Subject";


@Injectable()
export class LearnService{
  private url:string = "http://localhost:8080/topics";

  private headers = new Headers({'Content-Type': 'application/json'});

  constructor(private http:Http){

  }

  public getTopics(subject:Subject):Promise<Topics[]>{
    return this.http.get(this.url+"/today/subject/"+subject.subjectName)
      .toPromise()
      .then(response=> response.json() as Topics[])
      .catch(this.handleError);
  }

  public saveTopics(topics:Topics):Promise<any>{
    return this.http
      .post(this.url+"/add", JSON.stringify(topics),{headers: this.headers})
      .toPromise()
      .then(res=>"success")
      .catch(this.handleError);
  }


  public deleteATopic(topic:Topics):Promise<any>{
    return this.http
      .post(this.url+"/delete", JSON.stringify(topic),{headers: this.headers})
      .toPromise()
      .then(res=>"success")
      .catch(this.handleError);
  }


  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error); // for demo purposes only
    return Promise.reject(error.message || error);
  }

}

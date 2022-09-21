import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root',
})
export class QuizService {
  constructor(private _http: HttpClient) {}

  public quizzes() {
    return this._http.get(`${baseUrl}/product/`);
  }

  //add quiz
  public addQuiz(quiz) {
    return this._http.post(`${baseUrl}/product/`, quiz);
  }

  //delete quiz
  public deleteQuiz(id) {
    return this._http.delete(`${baseUrl}/product/${id}`);
  }

  //get the single quiz

  public getQuiz(qId) {
    return this._http.get(`${baseUrl}/product/${qId}`);
  }

  //update quiz
  public updateQuiz(quiz) {
    return this._http.put(`${baseUrl}/quiz/`, quiz);
  }

  //get quizzes of category
  public getQuizzesOfCategory(id) {
    return this._http.get(`${baseUrl}/product/category/${id}`);
  }
  //qet active quizzes
  public getActiveQuizzes() {
    return this._http.get(`${baseUrl}/product/active`);
  }

  //get active quizzes of category
  public getActiveQuizzesOfCategory(id) {
    return this._http.get(`${baseUrl}/product/category/${id}`);
  }
}

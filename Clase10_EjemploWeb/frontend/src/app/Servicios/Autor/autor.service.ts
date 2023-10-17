import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class AutorService {
  private baseUrl = 'http://localhost:3000/autores'
  constructor(
    private http: HttpClient
  ) { }

  registro(autor:any){
    return this.http.post<any>(`${this.baseUrl}/registrar`, autor)
  }
}

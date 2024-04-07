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

  login(autor:any){
    return this.http.post<any>(`${this.baseUrl}/login`, autor)
  }

  registro(autor:any){
    return this.http.post<any>(`${this.baseUrl}/registrar`, autor)
  }

  obtener(){
    return this.http.get<any>(`${this.baseUrl}/obtener`)
  }
}

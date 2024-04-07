import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class LibrosService {
  private baseUrl = 'http://localhost:3000/libros'
  constructor(
    private http: HttpClient
  ) { }


  registro(libro:any){
    return this.http.post<any>(`${this.baseUrl}/registrar`, libro)
  }

  misLibros(autor:any){
    console.log(autor)
    return this.http.post<any>(`${this.baseUrl}/mislibros`, autor)
  }
}

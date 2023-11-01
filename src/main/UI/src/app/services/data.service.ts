import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataService {
    private baseUrlEN: string = 'http://localhost:8080/api/welcomeEN';
    private baseUrlFR: string = 'http://localhost:8080/api/welcomeFR';

    constructor(private http: HttpClient) {}

    getDataEN(): Observable<any> {
    return this.http.get(`${this.baseUrlEN}`, { responseType: 'text' });
    }

    getDataFR(): Observable<any> {
    return this.http.get(`${this.baseUrlFR}`, { responseType: 'text' });
    }
}

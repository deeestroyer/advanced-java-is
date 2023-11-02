import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataService {
    private baseUrlEN: string = 'http://localhost:8080/api/welcomeEN';
    private baseUrlFR: string = 'http://localhost:8080/api/welcomeFR';
    private baseUrlET: string = 'http://localhost:8080/api/ET';
    private baseUrlMT: string = 'http://localhost:8080/api/ETtoMT';
    private baseUrlUTC: string = 'http://localhost:8080/api/ETtoUTC';

    constructor(private http: HttpClient) {}

    getDataEN(): Observable<any> {
    return this.http.get(`${this.baseUrlEN}`, { responseType: 'text' });
    }

    getDataFR(): Observable<any> {
    return this.http.get(`${this.baseUrlFR}`, { responseType: 'text' });
    }

    getDataET(): Observable<any> {
        return this.http.get(`${this.baseUrlET}`, { responseType: 'text' });
    }
    getDataMT(): Observable<any> {
        return this.http.get(`${this.baseUrlMT}`, { responseType: 'text' });
    }

    getDataUTC(): Observable<any> {
        return this.http.get(`${this.baseUrlUTC}`, { responseType: 'text' });
    }
}

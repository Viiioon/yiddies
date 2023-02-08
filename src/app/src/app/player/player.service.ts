import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Player } from "./model/player";
import { HttpClient } from '@angular/common/http';
import { environment } from "src/environments/environments";

@Injectable({
    providedIn: 'root'
})
export class PlayerService {
    private apiServerUrl = environment.apiBaseUrl;

    constructor(private http: HttpClient) {}

    public getPlayers(): Observable<Player[]> {
        return this.http.get<Player[]>(environment.apiBaseUrl +'/player/all');
    }

    public addPlayer(player: Player): Observable<Player> {
        return this.http.post<Player>('${this.apiServerUrl}/player/add', player);
    }

    public updatePlayer(player: Player): Observable<Player> {
        return this.http.put<Player>('${this.apiServerUrl}/player/add', player);
    }

    public deletePlayer(playerId: number): Observable<void> {
        return this.http.delete<void>('${this.apiServerUrl}/player/delete/${playerId}');
    }
}
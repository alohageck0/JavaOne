package Generics.Challenge;

import Generics.FootballPlayer;
import Generics.Team;

public class Main {
    public static void main(String[] args) {
        League<FootballPlayer> premierLeague = new League<>("Premier League");

        FootballPlayer joe = new FootballPlayer("Joe");
        Team<FootballPlayer> adelaideCrows = new Team<>("Crows");
        adelaideCrows.addPlayer(joe);
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Banks");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> howthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        howthorn.matchResult(fremantle, 1, 0);
        howthorn.matchResult(fremantle, 1, 3);
        howthorn.matchResult(fremantle, 3, 3);
        howthorn.matchResult(adelaideCrows, 3, 8);
        howthorn.matchResult(adelaideCrows, 10, 8);
        howthorn.matchResult(adelaideCrows, 8, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
        adelaideCrows.matchResult(fremantle, 2, 1);

        premierLeague.addTeam(melbourne);
        premierLeague.addTeam(adelaideCrows);
        premierLeague.addTeam(fremantle);
        premierLeague.addTeam(howthorn);
        premierLeague.printTeams();
    }
}

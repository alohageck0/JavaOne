package Generics.Challenge.Tims;

import Generics.BaseBallPlayer;
import Generics.FootballPlayer;
import Generics.Team;

public class Main {
   public static void main(String[] args) {
      League<Team<FootballPlayer>> footbalLeague = new League<>("League");
      FootballPlayer joe = new FootballPlayer("Joe");
      Team<FootballPlayer> adelaideCrows = new Team<>("Crows");
//      adelaideCrows.addPlayer(joe);
      Team<FootballPlayer> melbourne = new Team<>("Melbourne");
      FootballPlayer banks = new FootballPlayer("Banks");
//      melbourne.addPlayer(banks);

      Team<FootballPlayer> howthorn = new Team<>("Hawthorn");
      Team<FootballPlayer> fremantle = new Team<>("Fremantle");
      Team<BaseBallPlayer> baseBallPlayerTeam = new Team<>("Chicago Cubs");


      footbalLeague.add(adelaideCrows);
      footbalLeague.add(melbourne);
      footbalLeague.add(howthorn);
      footbalLeague.add(fremantle);
//      footbalLeague.add(baseBallPlayerTeam);

      howthorn.matchResult(fremantle, 1, 0);
      howthorn.matchResult(fremantle, 1, 3);
      howthorn.matchResult(fremantle, 3, 3);
      howthorn.matchResult(adelaideCrows, 3, 8);
      howthorn.matchResult(adelaideCrows, 10, 8);
      howthorn.matchResult(adelaideCrows, 8, 8);

      adelaideCrows.matchResult(fremantle, 2, 1);
      adelaideCrows.matchResult(fremantle, 2, 1);

      footbalLeague.showLeagueTable();






   }

}

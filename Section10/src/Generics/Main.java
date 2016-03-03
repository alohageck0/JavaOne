package Generics;


public class Main {
   public static void main(String[] args) {
      FootballPlayer joe = new FootballPlayer("Joe");
      BaseBallPlayer pat = new BaseBallPlayer("Pat");
      SoccerPlayer backham = new SoccerPlayer("Backham");

      Team<FootballPlayer> adelaideCrows = new Team<>("Crows");
      adelaideCrows.addPlayer(joe);
//      adelaideCrows.addPlayer(pat);
//      adelaideCrows.addPlayer(backham);

      System.out.println(adelaideCrows.numPlayers());

      Team<BaseBallPlayer> baseBallPlayerTeam = new Team<>("Chicago Cubs");
      baseBallPlayerTeam.addPlayer(pat);

      Team<SoccerPlayer> brokenTeam = new Team<>("This won't work");
      brokenTeam.addPlayer(backham);

      Team<FootballPlayer> melbourne = new Team<>("Melbourne");
      FootballPlayer banks = new FootballPlayer("Banks");
      melbourne.addPlayer(banks);

      Team<FootballPlayer> howthorn = new Team<>("Hawthorn");
      Team<FootballPlayer> fremantle = new Team<>("Fremantle");

      howthorn.matchResult(fremantle, 1, 0);
      howthorn.matchResult(adelaideCrows, 3, 8);

      adelaideCrows.matchResult(fremantle, 2, 1);
//      adelaideCrows.matchResult(baseBallPlayerTeam, 2, 1);

      System.out.println("Rankings");
      System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
      System.out.println(melbourne.getName() + ": " + melbourne.ranking());
      System.out.println(fremantle.getName() + ": " + fremantle.ranking());
      System.out.println(howthorn.getName() + ": " + howthorn.ranking());

      System.out.println(adelaideCrows.compareTo(melbourne));
      System.out.println(adelaideCrows.compareTo(howthorn));
      System.out.println(howthorn.compareTo(adelaideCrows));
      System.out.println(melbourne.compareTo(fremantle));
   }
}

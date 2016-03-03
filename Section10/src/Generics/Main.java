package Generics;


public class Main {
   public static void main(String[] args) {
      FootballPlayer joe = new FootballPlayer("Joe");
      BaseBallPlayer pat = new BaseBallPlayer("Pat");
      SoccerPlayer backham = new SoccerPlayer("Backham");

      Team adelaideCrows = new Team("Crows");
      adelaideCrows.addPlayer(joe);
      adelaideCrows.addPlayer(pat);
      adelaideCrows.addPlayer(backham);
   }
}

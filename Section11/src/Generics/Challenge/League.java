package Generics.Challenge;

import Generics.Player;
import Generics.Team;
import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Player>{
    private ArrayList<Team<T>> teams;
    private String name;

    public League(String name) {
        this.name = name;
        teams = new ArrayList<>();
    }

    public boolean addTeam(Team<T> team) {

        if (findTeam(team.getName()) == null) {
            this.teams.add(team);
            System.out.println(team.getName() + " was added to league " + this.name);
            return true;
        } else {
            System.out.println(team.getName()+ " already in league");
            return false;
        }
    }

    public Team findTeam(String name) {
        for (Team team : this.teams) {
            if (team.getName().equals(name)) {
                return team;
            }
        }
        return null;
    }
    public void printTeams(){
        Collections.sort(teams);
        for (Team team:this.teams
             ) {
            System.out.println(team.getName() + " has rank: "+ team.getRank());

        }
    }
}


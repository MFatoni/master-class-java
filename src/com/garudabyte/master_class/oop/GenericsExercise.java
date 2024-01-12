package com.garudabyte.master_class.oop;

public class GenericsExercise {

    public static void main(String[] args) {
	    // ArrayList<Team> teams;
        // Collections.sort(teams);
        // Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.


        GenericsExerciseLeague<GenericsExerciseTeam<GenericsExerciseFootballPlayer>> footballLeague = new GenericsExerciseLeague<>("AFL");
        GenericsExerciseTeam<GenericsExerciseFootballPlayer> adelaideCrows = new GenericsExerciseTeam<>("Adelaide Crows");
        GenericsExerciseTeam<GenericsExerciseFootballPlayer> melbourne = new GenericsExerciseTeam<>("Melbourne");
        GenericsExerciseTeam<GenericsExerciseFootballPlayer> hawthorn= new GenericsExerciseTeam<>("Hawthorn");
        GenericsExerciseTeam<GenericsExerciseFootballPlayer> fremantle= new GenericsExerciseTeam<>("Fremantle");
        GenericsExerciseTeam<GenericsExerciseBaseballPlayer> baseballTeam = new GenericsExerciseTeam<>("Chicago Cubs");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

//        footballLeague.add(baseballTeam);
        footballLeague.showLeagueTable();

        GenericsExerciseBaseballPlayer pat = new GenericsExerciseBaseballPlayer("Pat");
        GenericsExerciseSoccerPlayer beckham = new GenericsExerciseSoccerPlayer("Beckham");
        GenericsExerciseTeam rawTeam = new GenericsExerciseTeam("Raw Team");
        rawTeam.addPlayer(beckham); // unchecked warning
        rawTeam.addPlayer(pat);     // unchecked warning

        footballLeague.add(rawTeam);     // unchecked warning

        GenericsExerciseLeague<GenericsExerciseTeam> rawLeague = new GenericsExerciseLeague<>("Raw");
        rawLeague.add(adelaideCrows);     // no warning
        rawLeague.add(baseballTeam);    // no warning
        rawLeague.add(rawTeam);         // no warning

        GenericsExerciseLeague reallyRaw = new GenericsExerciseLeague("Really raw");
        reallyRaw.add(adelaideCrows);     // unchecked warning
        reallyRaw.add(baseballTeam);    // unchecked warning
        reallyRaw.add(rawTeam);         // unchecked warning





















    }
}

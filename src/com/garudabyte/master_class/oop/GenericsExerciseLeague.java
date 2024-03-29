package com.garudabyte.master_class.oop;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by dev on 18/10/2015.
 */
public class GenericsExerciseLeague<T extends GenericsExerciseTeam> {
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    public GenericsExerciseLeague(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if(league.contains(team)) {
            return false;
        }
        league.add(team);
        return true;
   }

    public void showLeagueTable() {
        Collections.sort(league);
        for(T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}

package com.garudabyte.master_class.oop;

public class GenericsMain {

    public static void main(String[] args) {
	    GenericsFootballPlayer joe = new GenericsFootballPlayer("Joe");
        GenericsBaseballPlayer pat = new GenericsBaseballPlayer("Pat");
        GenericsSoccerPlayer beckham = new GenericsSoccerPlayer("Beckham");

        GenericsTeam<GenericsFootballPlayer> adelaideCrows = new GenericsTeam<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        GenericsTeam<GenericsBaseballPlayer> baseballTeam = new GenericsTeam<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        GenericsTeam<GenericsSoccerPlayer> brokenTeam = new GenericsTeam<>("this won't work");
        brokenTeam.addPlayer(beckham);

        GenericsTeam<GenericsFootballPlayer> melbourne = new GenericsTeam<>("Melbourne");
        GenericsFootballPlayer banks = new GenericsFootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        GenericsTeam<GenericsFootballPlayer> hawthorn= new GenericsTeam<>("Hawthorn");
        GenericsTeam<GenericsFootballPlayer> fremantle= new GenericsTeam<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
//        adelaideCrows.matchResult(baseballTeam, 1, 1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));

//        ArrayList<Team> teams;
//        Collections.sort(teams);
    }
}

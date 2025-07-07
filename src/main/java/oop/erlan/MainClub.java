package oop.erlan;

public class MainClub {
    public static void main(String[] args) {
        FootballClub europa = new FootballClub();
        europa.name = "Real Madrid";
        europa.liga = "La Liga";
        europa.country = "Spain";
        europa.score = 59;
        europa.player = 5;
        europa.championsLeague = 15;
        europa.clubs();

        FootballClub kg = new FootballClub();
        kg.name = "Dordoi";
        kg.liga = "Top Liga";
        kg.country = "Kyrgyzstan";
        kg.score = 16;
        kg.player = 7;
        kg.championsLeague = 0;
        kg.ball();

        FootballClub ochko = new FootballClub();
        ochko.name = "Barcelona";
        ochko.liga = "La Liga";
        ochko.country = "Spain";
        ochko.score = 45;
        ochko.player = 10;
        ochko.championsLeague = 5;
        ochko.clubs();

        FootballClub sum = new FootballClub();
        sum.clubs();
//        kg.clubs();
//        europa.clubs();


    }
}

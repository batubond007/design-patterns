package main;

import main.adapters.SquarePegAdapter;
import main.round.RoundHole;
import main.round.RoundPeg;
import main.square.SquarePeg;

public class Main {
    public static void main(String[] args) {
        var roundHole = new RoundHole(5);
        var roundPeg = new RoundPeg(5);
        var littleSquarePeg = new SquarePeg(4);
        var littleSquarePegAdapter = new SquarePegAdapter(littleSquarePeg);
        var bigSquarePeg = new SquarePeg(9);
        var bigSquarePegAdapter = new SquarePegAdapter(bigSquarePeg);
        System.out.printf("Round peg fits:  %b%n", roundHole.fits(roundPeg));
        System.out.printf("Little Square peg fits:  %b%n", roundHole.fits(littleSquarePegAdapter));
        System.out.printf("Big Square peg fits:  %b%n", roundHole.fits(bigSquarePegAdapter));
    }
}
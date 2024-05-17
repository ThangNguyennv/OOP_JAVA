package com.patterns.adapter.pseudocode;

public class ClientTest {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roungPeg = new RoundPeg(5);
        System.out.println(roundHole.fits(roungPeg));
        SquarePeg smailSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);
      
        SquarePegAdapter smailSquarePegAdapter = new SquarePegAdapter(smailSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);
        System.out.println(roundHole.fits(smailSquarePegAdapter));
        System.out.println(roundHole.fits(largeSquarePegAdapter));
    }
}

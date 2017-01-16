/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Burrow Work-work
 */
public class Vampire extends Movable {

    private int X;
    private int Y;
    //private static final String[] MOVES = new String[] {"w", "a", "s", "d"};

    public Vampire(int X, int Y, int boundX, int boundY) {
        super(X, Y, boundX, boundY);
    }

    public void moveVampire(ArrayList<Vampire> list) {
        int newX = new Random().nextInt(3) - 1;
        int newY = new Random().nextInt(3) - 1;
        if (!vampireNearby(newX, newY, list)) {
            super.move(newX, newY);
        }
    }

    @Override
    public String toString() {
        return "v " + super.toString();
    }

    public boolean vampireNearby(int X, int Y, ArrayList<Vampire> list) {
        for (Vampire vampire : list) {
            if (X == vampire.getX() && Y == vampire.getY()) {
                return true;
            }
        }
        return false;
    }

}

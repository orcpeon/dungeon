/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.Scanner;

/**
 *
 * @author Burrow Work-work
 */
public class Player extends Movable {

    private Scanner reader;
    private int X;
    private int Y;
    private DestructionCheck destructor;

    public Player(Scanner reader, int boundX, int boundY) {
        super(0, 0, boundX, boundY);
        this.reader = reader;

    }

    @Override
    public String toString() {
        return "@ " + super.toString();
    }

//    public void movePlayer(String moveCommand) { //probably don't need it anymore
//        int newX = 0;
//        int newY = 0;
//        //String moveCommand = reader.nextLine();
//        for (int i = 0; i < moveCommand.length(); i++) {
//            if (moveCommand.charAt(i) == 'w') {
//                newY--;
//            }
//            if (moveCommand.charAt(i) == 'a') {
//                newX--;
//            }
//            if (moveCommand.charAt(i) == 's') {
//                newY++;
//            }
//            if (moveCommand.charAt(i) == 'd') {
//                newX++;
//            }
//            super.move(newX, newY);
//
//        }
//    }

    public void movePlayer(char dir) {
        int newX = 0;
        int newY = 0;
        //String moveCommand = reader.nextLine();

        if (dir == 'w') {
            newY--;
        }
        if (dir == 'a') {
            newX--;
        }
        if (dir == 's') {
            newY++;
        }
        if (dir == 'd') {
            newX++;
        }
        super.move(newX, newY);

    }
}



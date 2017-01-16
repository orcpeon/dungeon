/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author Burrow Work-work
 */
public class Movable {

    private static final String[] MOVES = new String[]{"w", "n", "e", "s"};
    private int X;
    private int Y;
    private int boundX;
    private int boundY;

    public Movable(int X, int Y, int boundX, int boundY) {
        this.X = X;
        this.Y = Y;
        this.boundX = boundX;
        this.boundY = boundY;
    }

    public int getX() {
        return this.X;
    }

    public int getY() {
        return this.Y;
    }

    public int getBoundX() {
        return this.boundX;
    }

    public int getBoundY() {
        return this.boundY;
    }

    public void move(int X, int Y) {
        if (X < 0) {
            if (this.X > 0) {
                this.X += X;
            }
        }
        if (X > 0) {
            if (this.X <= this.boundX-1) {
                this.X += X;
            }
        }
        if (Y < 0) {
            if (this.Y > 0) {
                this.Y += Y;
            }
        }
        if (Y > 0) {
            if (this.Y <= this.boundY-1) {
                this.Y += Y;
            }
        }
    }

    @Override
    public String toString() {
        return this.X + " " + this.Y;
    }

}

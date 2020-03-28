/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task5;

/**
 *
 * @author 19301261
 */
public class Vehicle2010 extends Vehicle {

    public void moveUpperRight() {
        moveUp();
        moveRight();
    }

    public void moveUpperLeft() {
        moveUp();
        moveLeft();
    }

    public void moveLowerRight() {
        moveDown();
        moveRight();
    }

    public void moveLowerLeft() {
        moveDown();
        moveLeft();
    }

    public String toString() {
        return "(" + super.x + ", " + super.y + ")";
    }

    public int getX() {
        return super.x;
    }

    public int getY() {
        return super.y;
    }

    public boolean equals(Vehicle2010 v2) {
        if (getX() == v2.getX() && getY() == v2.getY()) {
            return true;
        } else {
            return false;
        }
    }
}

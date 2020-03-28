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
public class Vehicle {

    int x = 0;
    int y = 0;

    public void moveUp() {
        y++;
    }

    public void moveDown() {
        y--;
    }

    public void moveRight() {
        x++;
    }

    public void moveLeft() {
        x--;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}

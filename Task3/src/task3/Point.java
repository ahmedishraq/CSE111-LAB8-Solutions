/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author DOLPHIN
 */
public class Point {

    private double radius;

    public Point(double r) {
        radius = r;
    }

    public double space() {
        System.out.println("Space for a point can't be defined");
        return 0;
    }

    protected double getRadius() {
        return radius;
    }
}

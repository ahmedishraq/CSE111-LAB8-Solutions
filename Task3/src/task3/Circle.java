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
public class Circle extends Point {

    public Circle(double r) {
        super(r);
        System.out.println("Enter radius of Circle: " + r);
        space();
    }

    public double space() {
        System.out.println("Creating a Circle ... done!");
        double a = Math.PI * super.getRadius() * super.getRadius();
        System.out.println("The area of the Circle is " + a);
        return 0;
    }
}

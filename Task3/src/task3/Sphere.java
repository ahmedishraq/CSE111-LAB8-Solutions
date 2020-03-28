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
public class Sphere extends Point {

    public Sphere(double r) {
        super(r);
        System.out.println("Enter redius of Sphere: " + r);
        space();
    }

    public double space() {
        System.out.println("Creating a Sphere ... done!");
        double a = (4 * Math.PI * super.getRadius() * super.getRadius() * super.getRadius()) / 3;
        System.out.println("The volume of the Sphere is " + a);
        return 0;
    }
}

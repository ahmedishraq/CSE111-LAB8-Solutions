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
public class Task5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle2010 car = new Vehicle2010();
        System.out.println(car);
        car.moveLowerLeft();
        System.out.println(car);
        Vehicle2010 car2 = new Vehicle2010();
        car2.moveLeft();
        System.out.println(car.equals(car2));
        car2.moveDown();
        System.out.println(car.equals(car2));

    }

}

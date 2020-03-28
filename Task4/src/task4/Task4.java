/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

/**
 *
 * @author DOLPHIN
 */
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        System.out.println(car);
        car.moveUp();
        System.out.println(car);
        car.moveLeft();
        System.out.println(car);
        car.moveDown();
        System.out.println(car);
        car.moveRight();
        System.out.println(car);
    }

}

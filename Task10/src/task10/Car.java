/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task10;

/**
 *
 * @author DOLPHIN
 */
public class Car {

    public static int count = 0;
    public int year;

    public Car(int y) {
        this.year = y;
        count++;
    }

    public int getYear() {
        return this.year;
    }

    public static int getObjectCount() {
        return count;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author DOLPHIN
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void printName(Student s) {
        System.out.println(s.toString());
    }

    public static void main(String[] args) {
        printName(new BBAStudent());
        printName(new BBAStudent("Humty Dumty"));
        printName(new BBAStudent("Little Bo Peep"));

    }

}

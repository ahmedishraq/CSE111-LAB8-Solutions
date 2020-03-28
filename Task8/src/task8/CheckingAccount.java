/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task8;

/**
 *
 * @author DOLPHIN
 */
public class CheckingAccount extends Account {
    public static int numberOfAccount = 0;

    public CheckingAccount() {
        super(0);
        numberOfAccount++;
    }

    public CheckingAccount(double b) {
        super(b);
        numberOfAccount++;
    }
}

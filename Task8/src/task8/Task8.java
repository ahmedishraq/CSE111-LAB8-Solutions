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
public class Task8 {

    /**
     * @param args the command line arguments
     */
    public static void printBalance(Account a) {
        System.out.println("Account Balance: " + a.getBalance());
    }

    public static void main(String[] args) {
        System.out.println("Number of Checking Accounts: " + CheckingAccount.numberOfAccount);
        printBalance(new CheckingAccount());
        printBalance(new CheckingAccount(100.00));
        printBalance(new CheckingAccount(200.00));
        System.out.println("Number of Checking Accounts: " + CheckingAccount.numberOfAccount);
    }

}

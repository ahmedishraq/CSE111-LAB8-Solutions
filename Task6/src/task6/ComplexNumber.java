/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task6;

/**
 *
 * @author 19301261
 */
public class ComplexNumber extends RealNumber {

    public double imaginaryValue = 1.0;

    public void setImaginaryValue(double imaginaryPart) {
        imaginaryValue = imaginaryPart;
    }

    public double getImaginaryValue() {
        return imaginaryValue;
    }

    public ComplexNumber() {
        setRealValue(1.0);
        setImaginaryValue(1.0);
    }

    public ComplexNumber(double realPart, double imaginaryPart) {
        setRealValue(realPart);
        setImaginaryValue(imaginaryPart);

    }

    public void check() {
        ping();
        super.ping();
        System.out.println("Checking ended");
    }

    public void ping() {
        System.out.println("I'm in ComplexNumber class");
    }

    public String toString() {
        return super.toString() + "\nImaginaryPart" + imaginaryValue;
    }
}

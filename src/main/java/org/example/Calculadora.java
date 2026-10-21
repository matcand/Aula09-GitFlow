package org.example;

public class Calculadora {

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisor não pode ser zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Resultado 10 / 2 = " + calc.divide(10, 2));
    }
}
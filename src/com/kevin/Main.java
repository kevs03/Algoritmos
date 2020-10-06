package com.kevin;

public class Main {
    public static void main (String[] args){

        Primo primo = new Primo( 10);

        var primos = primo.getPrimos ();
        System.out.println("Numeros primos:");
        for (int i = 0;i < primos.length;i++ ) System.out.print(primos[i] + ", ");
        System.out.println(" ");

        Fibonacci fibonacci = new Fibonacci(10);

        var fibonacciss = fibonacci.getFibonacci();
        System.out.println("Sucesion de fibonacci:");
        for (var fibo : fibonacciss) System.out.print(fibo + ", ");
    }
}

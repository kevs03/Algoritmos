package com.kevin;

public class Fibonacci {
    private int limite;
    private int[] fibonacci;

    Fibonacci(int limite){
        this.limite = limite;
        fibonacci = new int[limite];
    }

    public int getLimite(){
        return limite;
    }
    public void setLimite(int limite){
        this.limite = limite;
    }
    public int[] getFibonacci(){
        for (int i = 0;i < fibonacci.length;i++){
            fibonacci[i] = getPosition(i);
        }
        return fibonacci;
    }

    int getPosition(int n){
        if (n > 1){
            return getPosition(n - 1) + getPosition(n - 2);
        }
        else if (n == 1){
            return 1;
        }
        else {
            return 0;
        }
    }
}

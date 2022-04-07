package com.company;

import java.util.Scanner;

public class MiniDesafioDois {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Digite um número para saber a a posição do termo na sequência de Fibonacci:");
            int termoDigitado = scanner.nextInt();

            int fibo = fibonacci(termoDigitado);
            System.out.println("Fib(" + termoDigitado + ") = " + fibo);
        }
    }

    //0, 1, 1, 2, 3, 5, 8, 13, 21
    public static int fibonacci(int num){
        int primNum = 0;
        int segNum = 1;
        int numAtual = 0;

        for(int i = 0; i <= num - 3; i++){
            numAtual = primNum + segNum;
            primNum = segNum;
            segNum = numAtual;
        }

        return numAtual;

    }
}

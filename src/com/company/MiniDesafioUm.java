package com.company;

import java.util.Scanner;

public class MiniDesafioUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Digite o primeiro valor:");
            double numDigitado1 = scanner.nextDouble();


            System.out.println("Digite o segundo valor:");
            double numDigitado2 = scanner.nextDouble();

            scanner.nextLine();

            System.out.println("Digite o sinal de operação que você deseja usar:");
            System.out.println("Para somar, digite [+]");
            System.out.println("Para somar, digite [-]");
            System.out.println("Para somar, digite [*]");
            System.out.println("Para somar, digite [/]");
            System.out.println("Para sair, digite [s]air");
            String operadorDigitado = scanner.nextLine();

            if (operadorDigitado.equals("sair") || operadorDigitado.equals("s")){
                System.exit(0);
            }else {
                double resultadoDaOperacao = calculadora(numDigitado1, numDigitado2, operadorDigitado);

                System.out.println("Resultado de " + numDigitado1 + " " + operadorDigitado + " " + numDigitado2 + " = " + resultadoDaOperacao);
            }

        }
    }


    public static double calculadora(double num1, double num2, String operador){
        double resultado;
        if(operador.equals("+")){
            resultado = num1 + num2;
        }else if (operador.equals("-")){
            resultado = num1 - num2;
        }else if (operador.equals("*")){
            resultado = num1 * num2;
        }else if (operador.equals("/")){
            if(num2 != 0) {
                resultado = num1 / num2;
            }else {
                resultado = 0;
                System.out.println("Não é possível dividir por zero. O resultado retornou zero.");
            }
        }else{
            System.out.println("Opção de operação inválida. O resultado retornou zero.");
            resultado = 0;
        }
        return resultado;
    }
}

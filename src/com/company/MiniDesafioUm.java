package com.company;

import java.util.Scanner;

public class MiniDesafioUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Digite a quantidade de números que deseja calcular:");
            int qtd = scanner.nextInt();

            if(qtd <= 1){
                System.out.println("Sem sacanagem, digita pelo menos dois num aí, pô...");
                continue;
            }
            double[] vetorNum = new double[qtd];
            for(int i = 0; i < vetorNum.length;i++) {
                System.out.println("Digite o "+ (i+1) +"º valor:");
                vetorNum[i] = scanner.nextDouble();
            }


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
                double resultadoDaOperacao = calculadora(vetorNum, operadorDigitado);

                System.out.println("Resultado com a operação " + operadorDigitado + " é: " + resultadoDaOperacao);
            }

        }
    }


    public static double calculadora(double[] vetor, String operador){
        double resultado = 0;
        if(operador.equals("+")){
            for (int i = 0; i < vetor.length;i++){
                resultado += vetor[i];
            }
        }else if (operador.equals("-")){
            resultado = vetor[0];
            for (int i = 1; i < vetor.length;i++){
                resultado -= vetor[i];
            }
        }else if (operador.equals("*")){
            resultado = 1;
            for (int i = 0; i < vetor.length;i++){
                resultado *= vetor[i];
            }
        }else if (operador.equals("/")){
            resultado = vetor[0];
            for (int i = 1; i < vetor.length;i++){
                if(vetor[i] != 0) {
                    resultado /= vetor[i];
                }else {
                    System.out.println("Ops... Uma divisão por zero detectada. Vamos te retornar zero. Rsrsrs...");
                    resultado = 0;
                }
            }
        }else{
            System.out.println("Opção de operação inválida. O resultado retornou zero.");
            resultado = 0;
        }
        return resultado;
    }
}

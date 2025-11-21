package org.exercicio.one;

import java.util.Scanner;

//Calcula a soma do numero informado se ele for >= à 1

public class Main {
    public static void main(String[] args) {

        //Variaveis
        int n = 0;
        int total = 0;
        String entrada;

        //Input
        Scanner input = new Scanner(System.in);
        System.out.println("Ponha um numero maior ou igual à 1:");
        entrada = input.nextLine();

        //Checa se tem numeros
        if(entrada.matches(".*[0-9].*") && !entrada.isBlank()){
            n = Integer.parseInt(entrada);
        }else{
            //Se tem letra, fecha o programa
            System.out.println("Digite um numero, não uma letra ou deixe-as vazias.");
            return;
        }

        //Checa se o numero é >= à 1
        if (n >= 1){
            //Faz adição
            for (int i = 1; i <= n; i++){
                total += i;
            }

            System.out.println("Total: " + total);
        }else{
            System.out.println("Seu numero é abaixo de 1!");
        }
    }
}
package org.exercicio.one;

import java.util.Scanner;

//Main class
public class Main {
    public static void main(String[] args) {

        //variables
        int n = 0;
        int total = 0;
        String entrada;

        //Input to number
        Scanner input = new Scanner(System.in);
        System.out.println("Ponha um numero maior ou igual à 1:");
        entrada = input.nextLine();

        //Check if is letter
        if(entrada.chars().noneMatch(Character::isLetter) && !entrada.isBlank()){
            n = Integer.parseInt(entrada);
        }else{
            //if is letter, the program close
            System.out.println("Digite um numero, não uma letra ou deixe-as vazias.");
            System.exit(400);
        }

        //Check if the number is more or equal than 1
        if (n >= 1){
            //Do the addition
            for (int i = 1; i <= n; i++){
                total += i;
                System.out.println("Total: " + total);
            }
        }else{
            System.out.println("Seu numero é abaixo de 1!");
        }
    }
}
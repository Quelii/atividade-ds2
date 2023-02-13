// 7 Crie um algoritmo que leia dois números e apresente a diferença entre eles.

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o primeiro número: ");
        int num1 = sc.nextInt();
        
       System.out.print("Informe o segundo número: ");
        int num2 = sc.nextInt();

        int diferenca = Math.abs(num1 - num2);
        System.out.println("A diferença entre os números é: " + diferenca);

   
        }
    }



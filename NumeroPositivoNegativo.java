// 5 Crie um algoritmo usando DoWhile que solicite ao usuário a entrada de N números 
//inteiros e mostre na tela se este número é positivo ou negativo e só encerre o programa 
//quando o usuário digitar o número 0.

import java.util.Scanner;

public class NumeroPositivoNegativo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    
    do {
      System.out.print("Digite um número inteiro: ");
      num = sc.nextInt();
      
      if (num > 0) {
        System.out.println(num + " é um número positivo.");
      } else if (num < 0) {
        System.out.println(num + " é um número negativo.");
      }
    } while (num != 0);
    
    System.out.println("Programa encerrado.");
  }
}

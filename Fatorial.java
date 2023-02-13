// 2 Crie um algoritmo que solicite um número inteiro positivo ao usuário e na sequência, //calcule e exiba o número do fatorial.

import java.util.Scanner;

public class Fatorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    long fatorial = 1;
    
    System.out.print("Digite um número inteiro positivo: ");
    num = sc.nextInt();
    
    if (num >= 0) {
      for (int i = 1; i <= num; i++) {
        fatorial *= i;
      }
      
      System.out.println("O fatorial de " + num + " é: " + fatorial);
    } else {
      System.out.println("Número inválido. Por favor, digite um número inteiro positivo.");
    }
  }
}

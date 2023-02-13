// 3 Crie um algoritmo usando While que solicite ao usuário a entrada de N números inteiros 
// e positivos, no final exiba o menor e o maior número digitado.

import java.util.Scanner;

public class MaiorMenor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num, contador = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
    
    System.out.print("Digite o número de números inteiros positivos a serem digitados: ");
    int n = sc.nextInt();
    
    while (contador < n) {
      System.out.print("Digite um número inteiro positivo: ");
      num = sc.nextInt();
      
      if (num > 0) {
        contador++;
        if (num > maior) {
          maior = num;
        }
        if (num < menor) {
          menor = num;
        }
      } else {
        System.out.println("Número inválido. Por favor, digite um número inteiro positivo.");
    }
    }
    
    System.out.println("O menor número digitado foi: " + menor);
    System.out.println("O maior número digitado foi: " + maior);
    }
    }


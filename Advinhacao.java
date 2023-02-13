// 4 Crie um algoritmo usando While que sorteie um número de 0 a 100 e que permita que o 
//usuário tente acertar o número que foi sorteado. Se o usuário não acertar, deve imprimir 
//uma mensagem informando se o número sorteado é maior ou menor que a tentativa feita. //Quando o usuário acertar, imprima o total de tentativas feitas.

import java.util.Scanner;
import java.util.Random;

public class Advinhacao {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int numSorteado = rand.nextInt(101);
    int numTentativas = 0, num;
    
    while (true) {
      System.out.print("Digite um número entre 0 e 100: ");
      num = sc.nextInt();
      
      numTentativas++;
      
      if (num == numSorteado) {
        System.out.println("Você acertou o número sorteado em " + numTentativas + " tentativas.");
        break;
      } else if (num < numSorteado) {
        System.out.println("O número sorteado é maior que " + num + ".");
      } else {
        System.out.println("O número sorteado é menor que " + num + ".");
      }
    }
  }
}


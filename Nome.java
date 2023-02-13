// 1 Crie um algoritmo que solicite ao usuário que digite 3 nomes e no final imprima o total 
//de nomes que começam com a primeira letra com uma vogal e o total de nomes que 
//começam com a primeira letra com uma consoante.

import java.util.Scanner;

public class Nome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int vogal = 0;
    int consoante = 0;
    String[] nomes = new String[3];
    
    for (int i = 0; i < nomes.length; i++) {
      System.out.print("Digite o nome " + (i + 1) + ": ");
      nomes[i] = sc.nextLine();
    }
    
    for (int i = 0; i < nomes.length; i++) {
      char primeiraLetra = nomes[i].charAt(0);
      
      if (primeiraLetra == 'A' || primeiraLetra == 'a' ||
          primeiraLetra == 'E' || primeiraLetra == 'e' ||
          primeiraLetra == 'I' || primeiraLetra == 'i' ||
          primeiraLetra == 'O' || primeiraLetra == 'o' ||
          primeiraLetra == 'U' || primeiraLetra == 'u') {
        vogal++;
      } else {
        consoante++;
      }
    }
    
    System.out.println("Total de nomes que começam com vogal: " + vogal);
    System.out.println("Total de nomes que começam com consoante: " + consoante);
  }
}

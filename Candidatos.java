//6 Crie um algoritmo usando Do While , Switch Case e If que receba o nome de 3 
//candidatos e em seguida solicite N votos a esses candidatos só encerre o programa 
//quando digitar 0 e em seguida, imprima o total de votos que cada candidato recebeu e 
//apresente que venceu a eleição.

import java.util.Scanner;

public class Candidatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] candidatos = new String[3];
        int[] votos = new int[3];

        // Recebendo nomes dos candidatos
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do candidato " + (i + 1) + ": ");
            candidatos[i] = sc.nextLine();
        }

        int voto;
        do {
            System.out.println("\nEscolha um candidato para votar:");
            for (int i = 0; i < 3; i++) {
                System.out.println((i + 1) + ". " + candidatos[i]);
            }
            System.out.print("Sua opção: ");
            voto = sc.nextInt();

            switch (voto) {
                case 1:
                    votos[0]++;
                    break;
                case 2:
                    votos[1]++;
                    break;
                case 3:
                    votos[2]++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (voto != 0);

        // Imprimindo resultados da eleição
        System.out.println("\nResultados da eleição:");
        for (int i = 0; i < 3; i++) {
            System.out.println(candidatos[i] + ": " + votos[i] + " votos");
        }

        // Verificando o vencedor
        int vencedor = 0;
        for (int i = 1; i < 3; i++) {
            if (votos[i] > votos[vencedor]) {
                vencedor = i;
            }
        }
        System.out.println("\nO vencedor da eleição é " + candidatos[vencedor] + " com " + votos[vencedor] + " votos.");
    }
}


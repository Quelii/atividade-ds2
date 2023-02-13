// 8 Crie um algoritmo que leia dois números e imprima-os em ordem decrescente.

import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

     System.out.print("Informe o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        int num2 = scanner.nextInt();


        if (num1 > num2) {
            System.out.println(num1 + " " + num2);
        } else {
            System.out.println(num2 + " " + num1);
        }
    }
}

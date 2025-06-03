package lista10;

import java.util.Scanner;

public class Exercicio103_SomaFatoriaisDe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long soma = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            int valor = sc.nextInt();
            long fatorial = 1;

            for (int j = 1; j <= valor; j++) {
                fatorial *= j;
            }

            soma += fatorial;
        }

        System.out.println("Soma dos fatoriais: " + soma);
        sc.close();
    }
}

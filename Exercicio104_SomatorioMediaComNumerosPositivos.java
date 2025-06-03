package lista10;

import java.util.Scanner;

public class Exercicio104_SomatorioMediaComNumerosPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, quantidade = 0;
        int valor;

        do {
            System.out.print("Digite um valor positivo (ou negativo para sair): ");
            valor = sc.nextInt();
            if (valor >= 0) {
                soma += valor;
                quantidade++;
            }
        } while (valor >= 0);

        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);
            System.out.println("Total de valores lidos: " + quantidade);
        } else {
            System.out.println("Nenhum valor positivo foi lido.");
        }

        sc.close();
    }
}

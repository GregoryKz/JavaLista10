package lista10;

import java.util.Scanner;

public class Exercicio107_MaiorMenorValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        do {
            System.out.print("Digite um valor positivo (ou negativo para sair): ");
            valor = sc.nextInt();

            if (valor >= 0) {
                if (valor > maior) maior = valor;
                if (valor < menor) menor = valor;
            }
        } while (valor >= 0);

        if (maior != Integer.MIN_VALUE) {
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        } else {
            System.out.println("Nenhum valor positivo foi inserido.");
        }

        sc.close();
    }
}

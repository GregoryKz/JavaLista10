package lista10;

import java.util.Scanner;

public class Exercicio106_AreaResidenciaPorComodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalArea = 0;
        String resposta;

        do {
            System.out.print("Nome do cômodo: ");
            String nome = sc.nextLine();

            System.out.print("Largura do cômodo (m): ");
            double largura = sc.nextDouble();

            System.out.print("Comprimento do cômodo (m): ");
            double comprimento = sc.nextDouble();
            sc.nextLine(); // Limpa o buffer

            double area = largura * comprimento;
            totalArea += area;

            System.out.println("Área do " + nome + ": " + area + " m²");

            System.out.print("Deseja adicionar outro cômodo? (SIM/NAO): ");
            resposta = sc.nextLine().toUpperCase();
        } while (!resposta.equals("NAO"));

        System.out.println("Área total da residência: " + totalArea + " m²");
        sc.close();
    }
}

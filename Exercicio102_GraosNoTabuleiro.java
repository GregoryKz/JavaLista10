package lista10;

public class Exercicio102_GraosNoTabuleiro {
    public static void main(String[] args) {
        double total = 0;
        double graos = 1;

        for (int i = 1; i <= 64; i++) {
            total += graos;
            graos *= 2;
        }

        System.out.println("Total de grãos no tabuleiro: " + total);
    }
}

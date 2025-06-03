package lista10;

public class Exercicio100_SomatorioParesAte500 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 2; i <= 500; i += 2) {
            soma += i;
        }
        System.out.println("Soma dos pares de 1 até 500: " + soma);
    }
}

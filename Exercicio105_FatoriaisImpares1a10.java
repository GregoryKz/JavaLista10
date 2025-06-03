package lista10;

public class Exercicio105_FatoriaisImpares1a10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i += 2) {
            long fatorial = 1;
            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }
    }
}

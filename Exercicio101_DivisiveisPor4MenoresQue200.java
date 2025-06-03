package lista10;

public class Exercicio101_DivisiveisPor4MenoresQue200 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 200) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

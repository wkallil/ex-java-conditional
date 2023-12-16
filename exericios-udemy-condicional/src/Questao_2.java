import java.util.Scanner;

public class Questao_2 {
    public static void main(String[] args) {
//        Fazer um programa para ler
//        um número inteiro e dizer se este número é par ou ímpar.
        Scanner s = new Scanner(System.in);

        int numero;

        numero = s.nextInt();

        if (numero % 2==0) {
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }
    }
}

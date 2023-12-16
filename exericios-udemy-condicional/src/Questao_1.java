import java.util.Scanner;

public class Questao_1 {
    public static void main(String[] args) {
//        Fazer um programa para ler um número inteiro,
//        e depois dizer se este número é negativo ou não.

        Scanner s = new Scanner(System.in);
        int numero;

        numero = s.nextInt();

        if (numero >= 0) {
            System.out.println("NAO NEGATIVO");
        } else {
            System.out.println("Negativo");
        }

    }


}

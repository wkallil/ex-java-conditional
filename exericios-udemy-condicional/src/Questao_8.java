import java.util.Locale;
import java.util.Scanner;

public class Questao_8 {
    public static void main(String[] args) {
       /* Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
        que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
        qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
        Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
        mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.*/

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        double imposto;
        double renda = s.nextDouble();

        if (renda<=2000.0) {
            imposto=0.0;
            System.out.println("Isento");
        } else if (renda<=3000.0) {
            imposto = (renda - 2000.0) * 0.08;
            System.out.printf("R$ %.2f", imposto);
        } else if (renda<=4500.0) {
            imposto = (renda - 3000.0) * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f", imposto);
        } else {
            imposto = (renda - 4500) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f", imposto);
        }


    }
}

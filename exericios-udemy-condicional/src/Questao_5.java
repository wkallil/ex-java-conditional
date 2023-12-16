import java.util.Scanner;

public class Questao_5 {
    public static void main(String[] args) {
//        Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//        seguir, calcule e mostre o valor da conta a pagar.

        Scanner s = new Scanner(System.in);
        int codigoProduto, quantidadePedido;
        double valorCompra;

        codigoProduto = s.nextInt();
        quantidadePedido = s.nextInt();

        if (codigoProduto==1) {
            valorCompra = quantidadePedido * 4.0;
            System.out.printf("Total: R$ %.2f", valorCompra);
        } else if (codigoProduto == 2) {
            valorCompra = quantidadePedido * 4.5;
            System.out.printf("Total: R$ %.2f", valorCompra);
        }else if (codigoProduto == 3) {
            valorCompra = quantidadePedido * 5.0;
            System.out.printf("Total: R$ %.2f", valorCompra);
        }else if (codigoProduto == 4) {
            valorCompra = quantidadePedido * 2.0;
            System.out.printf("Total: R$ %.2f", valorCompra);
        }else if (codigoProduto == 5) {
            valorCompra = quantidadePedido * 1.5;
            System.out.printf("Total: R$ %.2f", valorCompra);
        }


    }
}

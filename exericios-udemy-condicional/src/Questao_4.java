import java.util.Scanner;

public class Questao_4 {
    public static void main(String[] args) {
//        Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
//        sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora
//        e máxima de 24 horas.
        Scanner s = new Scanner(System.in);

        int horaInicial, horaFinal, duracao;

        horaInicial = s.nextInt();
        horaFinal = s.nextInt();

        if (horaInicial<horaFinal){
            duracao = horaFinal - horaInicial;
            System.out.println("O jogo durou "+ duracao+ " Hora(s)");
        } else {
            duracao = 24 - (horaInicial - horaFinal);
            System.out.println("O jogo durou "+ duracao+ " Hora(s)");

        }

    }
}

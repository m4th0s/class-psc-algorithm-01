import java.util.Scanner;

public class Revisao03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas amizades você fez Riley? ");
        int amizades = sc.nextInt();

        System.out.print("Digite a primeira nota da A1: ");
        double a1 = sc.nextDouble();

        System.out.print("Digite a segunda nota da A2: ");
        double a2 = sc.nextDouble();

        System.out.print("Digite a terceira nota da A3: ");
        double a3 = sc.nextDouble();

        System.out.print("Quantos algoritmos você realizou? ");

        int exerciciosRealizados = sc.nextInt();

        int pontosAlegria = 0;
        int pontosTristeza = 0;

        if (amizades > 0) {
            pontosAlegria += amizades * 10;
        } else {
            pontosTristeza += 30;
        }

        double media = (a1 + a2 + a3) / 3;

        if (media >= 7) {
            pontosAlegria += 50;
        } else {
            pontosTristeza += 50;
        }

        
        pontosAlegria += (exerciciosRealizados) * 10;
        pontosTristeza += (10 - exerciciosRealizados) * 10;

        if (pontosAlegria > pontosTristeza) {
            System.out.println(
                "A mudança para a nova cidade foi uma experiência incrível para a Riley."
            );
        } else {
            System.out.println(
                "A mudança para a nova cidade foi uma experiência desagradável para a Riley."
            );
        }

        sc.close();
    }
}

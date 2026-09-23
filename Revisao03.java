import java.util.Scanner;

public class Revisao03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas amizades você fez? ");
        int amizades = sc.nextInt();

        System.out.println("Digite a primeira nota: ");
        double a1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double a2 = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double a3 = sc.nextDouble();

        System.out.println("Quantos exercícios você realizou? ");
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

        
        pontosAlegria += exerciciosRealizados * 10;
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

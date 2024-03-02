import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // nome do meu scanner;
        double media = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite suas notas dos filmes: ");
            nota = entrada.nextDouble();
            media += nota;

        }
        System.out.println("A media dos filme é: " + media / 3);

    }
}

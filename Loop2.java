import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        int contagem = 0;

        while (nota != -1) {
            System.out.print("Diga sua avaliação para o filme: ");
            nota = sc.nextDouble();
            if (nota >= 0) {
                media += nota;
                contagem++;
            }
        }
        if (media > 0) {
            System.out.println("Media do filme: " + media / contagem);
        }else System.out.println("Filme sem avaliações");
    }
}

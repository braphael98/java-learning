import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Para calcular a area do quadrado digite 1, ou digite 2 para calcular o circulo");
        int areas = sc.nextInt();
        switch (areas) {
            case 1:
                System.out.println("Digite os lados do quadrado");
                System.out.print("Lado 1: ");
                int a = sc.nextInt();
                System.out.print("Lado 2: ");
                int b = sc.nextInt();
                System.out.println("Area do quadrado: " + a * b);

                break;

            case 2:
                System.out.println("Digite o tamanho do raio: ");
                float raio = sc.nextFloat();
                System.out.println("Area do circulo: " + 3.1415 *(raio*raio));
                break;

            default:
                System.out.println("Operação invalida !!!");
                break;
        }
    }
}
//Area
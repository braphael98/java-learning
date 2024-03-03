import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("O numero é par");
        } else
            System.out.println("O numero é impar");
    }
}
//Verificar se o numero é par ou impar
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números inteiros:");
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        int soma = a + b;
        System.out.println("A soma de A + B é: "+soma);

    }
}

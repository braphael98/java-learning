import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite dois numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Os numeros são identicos");
        } else
            System.out.println("Não são identicos");
        if (a > b) {
            System.out.println("O primeiro numero:" + a + " é maior que o segundo numero");

        }
        if (a < b) {
            System.out.println("O segundo numero: " + b + " é maior que o primeiro");

        }
    }
}//comparação

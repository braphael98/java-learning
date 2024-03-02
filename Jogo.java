import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        int num1 = new Random().nextInt(3);
        Scanner sc = new Scanner(System.in);
        int tentativas = 5;
        System.out.println("Jogo de adivinhar !");
       
        for (int i = 0; i <= 5; i++) {
            System.out.print("Digite um numero: ");
            int usernumber1 = sc.nextInt();
            tentativas--;


            if (usernumber1 == num1) {
                System.out.println("Parabens você acertou !!!");
                break;
            } else
                System.out.println("Tente novamente "+ tentativas+ " Restantes");
            if(usernumber1 > num1){
                System.out.println("Seu numero é maior que o numero aleatorio");
            }else System.out.println("Seu numero é menor que o numero aleatorio");

        }
        System.out.println("O numero aleatorio é: " + num1);
    }
}

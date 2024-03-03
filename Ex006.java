import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int a = sc.nextInt();
        if(a < 0){
            System.out.println("Seu numero: "+a+ " é negativo !");
        }else System.out.println("Seu numero: "+a+" é positivo !");
    }
}
//Comparar
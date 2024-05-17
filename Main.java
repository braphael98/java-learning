//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu =  """
                1-Guerreiro
                2-Paladino
                """;
        //System.out.println("---------------------------");
        //System.out.println("-Fazendeiro: Olá bravo aventureiro, os ratos estão atancando nossa plantação de milho, por favor nos ajude!");
        //System.out.println("-Fazendeiro diz: Por favor poderia me dizer o seu nome ?");
        //System.out.println("-Meu nome é: ");
        Hero heroi = new Hero();
        //heroi.setName(sc.nextLine());
        heroi.setName("Exemplo");
        //System.out.println("-Fazendeiro diz: Olá  "+heroi.getName()+"!!!");
        //System.out.println("----ESCOLHA SUA CLASSE----");
        //System.out.println(menu);
        //heroi.setClass(sc.nextInt());
        heroi.setClass(1);
        Mice mice = new Mice();
        Wolf lobo = new Wolf();
        System.out.println("COMBATE");
        System.out.println("*RATO SE PREPARA PARA O COMBATE*");
        Combate combate = new Combate();
        combate.setHeroi(heroi);
        combate.setMob(mice);
        combate.fight();
        System.out.println("Parabens ! você consegui derrotar o a rato que estava me incomodando");
        System.out.println(".....");
        System.out.println("**LOBO SURGE DAS SOMBRAS**");
        combate.setHeroi(heroi);
        combate.setMob(lobo);
        combate.fight();












    }
}

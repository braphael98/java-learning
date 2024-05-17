import java.util.Scanner;
import java.util.Random;
public class Combate {
    Hero heroi = new Hero();
    Mob mob = new Mob();
    public void setHeroi(Hero heroi){
        this.heroi = heroi;

    }
    public void setMob(Mob mob){
        this.mob = mob;
    }
    public void fight() {
        Scanner sc = new Scanner(System.in);
        while (mob.getHp()>0) {
            sendMenu();
            System.out.println("----------");

            switch (sc.nextInt()) {
                case 1:
                    System.out.println(this.heroi.getName() + " Ataca !");
                    playerAtk();
                    break;
                case 2:

                    break;

                case 3:
                    System.out.println("HP: " + heroi.getHp() + "\nMP: " + heroi.getMp() + "\nATK: " + heroi.getDef() +
                            "\nDEF: " + heroi.getDef() + "\nCRT: " + heroi.getCrit());
                    break;

                default:

                    break;

            }
            if(mob.getHp() <= 0){
                System.out.println("Vitoria!");
                heroi.addExperience(mob.getXpDrop());
                System.out.println("Xp ganha: "+ mob.getXpDrop());
                break;
            }
            mobAtk();
        }
    }

    private void sendMenu(){
        System.out.println("**MEU DE COMBATE**\n1 Atack \n2 Defense \n3 Stat \n4 Pass");
    }
    private void playerAtk(){
        Random rng = new Random();
        int erros = 0;
        int atkValue = rng.nextInt(heroi.getAtk());
        System.out.println("Dano: "+atkValue);
        int dmg = (atkValue-mob.getHp());
        if(dmg > mob.getHp()){
            mob.setHp(0);
        }
        mob.setHp(dmg-mob.getHp());

    }
    private void mobAtk(){
        System.out.println(mob.getNome()+" Ataca!");
        Random rng = new Random();
        int atkValue = rng.nextInt(mob.getAtk());
        int dmg = (atkValue - this.heroi.getDef());
        if(dmg <= 0){
            System.out.println(mob.getNome()+"Errou!");
        }else {
            System.out.println(this.mob.getNome()+" DANO "+dmg);
            this.heroi.setHp(this.heroi.getHp() - dmg);
            System.out.println(this.heroi.getName()+" HP "+heroi.getHp());

        }
    }


}

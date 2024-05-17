public class Hero {
    String name;
    private int hp;
    private int mp;
    private int atk;
    private int def;
    private float crit;
    private int experience;
    private int level;

    private float xpLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public float getCrit() {
        return crit;
    }

    public void setCrit(float crit) {
        this.crit = crit;
    }

    public float getExperience() {

        return experience;
    }

    public void addExperience(int experience) {
        this.experience += experience;
        this.setLevel(this.experience/10);
    }

    public int getLevel() {

        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setClass(int ClassName) {
        switch (ClassName) {
            case 1:
                System.out.println("Guerreiro");
                this.setHp(10);
                this.setAtk(8);
                this.setMp(10);
                this.setDef(0);
                this.setCrit(5);
                this.setLevel(1);
                System.out.println("ATK :"+this.getAtk()+"\n"+"DEF :"+this.getDef()+"\n"+"level :"+this.getLevel()+"\n");
                break;
            case 2:
                System.out.println("Paladino");
                this.setHp(11);
                this.setAtk(4);
                this.setMp(10);
                this.setDef(6);
                this.setCrit(3);
                this.setLevel(1);
                System.out.println("ATK :"+this.getAtk()+"\n"+"DEF :"+this.getDef()+"\n"+"level :"+this.getLevel()+"\n");
                break;
        }
    }
}

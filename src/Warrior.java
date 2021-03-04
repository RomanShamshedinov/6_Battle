public class Warrior extends Troll implements InFighting {
    public Warrior(String name, String specialization) {
        super(name, specialization);
    }

    @Override
    public void run() {
        System.out.println("топает из битвы как слон");
    }

    @Override
    public void attack1() {
        System.out.println("кинул меч");
    }

    @Override
    public void attack2() {
        System.out.println("использует таран головой");
    }

    @Override
    public void defence() {
        System.out.println("укрылся за щитом");
    }
}

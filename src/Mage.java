public class Mage extends Human implements Hexing {
    public Mage(String name, String specialization) {
        super(name, specialization);
    }

    @Override
    public void run() {
        System.out.println("убегает легкой поступью");
    }
}

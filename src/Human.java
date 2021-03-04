public abstract class Human {
    public String name;
    public String specialization;

    public abstract void run();

    public void death() {
        System.out.println("ПОТРАЧЕНО");
    }

    public Human(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
}

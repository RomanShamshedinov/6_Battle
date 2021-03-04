public class Battle {
    protected void start() {
        System.out.println("Битва началась!");
        Mage person1 = new Mage("Гарри Поттер", "Проклинатель");
        Warrior person2 = new Warrior("Детрит", "Стражник");
        System.out.print(person1.specialization + " " + person1.name + " ");
        person1.attack2();
        System.out.print(person2.specialization + " " + person2.name + " ");
        person2.defence();
        System.out.print(person2.specialization + " " + person2.name + " ");
        person2.attack2();
        System.out.print(person1.name + " ");
        person1.run();
        System.out.print(person2.specialization + " " + person2.name + " ");
        person2.attack1();
        System.out.print(person1.specialization + " " + person1.name + ":\n");
        System.out.print("1. ");
        person1.defence2();
        System.out.print("2. ");
        person1.defence1();
        System.out.print("3. ");
        person1.attack1();
        System.out.print(person2.specialization + " " + person2.name + ":\n");
        System.out.print("1. ");
        person2.run();
        System.out.print("2. ");
        person2.death();
        System.out.println("Битва окночена! Победил: " + person1.specialization + " " + person1.name);
    }
}

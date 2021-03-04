public interface Hexing {
    default void attack1() {
        System.out.println("применил заклинание Авада кедавра");
    }

    default void attack2() {
        System.out.println("применил заклинание Иссушение");
    }

    default void defence1() {
        System.out.println("пустил пыль в глаза");
    }

    default void defence2() {
        System.out.println("применил заклинание Укрепление кожи");
    }
}

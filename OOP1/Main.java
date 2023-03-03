package OOP1;
public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", 56);
        Person oleg = new Person("Игорь", 60);
        Person vasya = new Person("Вася", 30);
        Person masha = new Person("Маша", 27);
        Person jane = new Person("Женя", 10);
        Person ivan = new Person("Ваня", 8);
        Person Sasha = new Person("Саша", 9);
        Person Semen = new Person("Семен", 10);
        Person Lesha = new Person("Леша", 11);
        Person Sasha12 = new Person("Саша", 12);
        Person Misha = new Person("Миша", 3);
        GeoTree gt = new GeoTree();
        gt.appendPerentChild(irina, vasya); // Ирина родитель Васи
        gt.appendPerentChild(irina, masha); // Ирина родитель Маши
        gt.appendPerentChild(vasya, jane); // Вася родитель Жени
        gt.appendPerentChild(vasya, ivan); // Вася родитель Ивана
        gt.appendVifeHusbent(irina, oleg); // Ирина жена Олега
        gt.appendPerentChild(oleg, vasya); // Олег родитель Васи
        gt.appendPerentChild(oleg, masha); // Олег родитель Маши
        gt.appendPerentChild(oleg, Sasha); // Олег родитель Саши
        gt.appendPerentChild(oleg, Semen); // Олег родитель Семена
        gt.appendPerentChild(oleg, Lesha); // Олег родитель Леши
        gt.appendPerentChild(oleg, Misha); // Олег родитель Миши        

        // Ищем детей Ирины
        System.out.println("Дети Ирины");
        System.out.println(new Research(gt).spend(irina, Relationship.parent));
        // Ищем детей Игоря
        System.out.println("Дети Олега");
        System.out.println(new Research(gt).spend(oleg, Relationship.parent));

        // Ищем мужа Ирины (Чья жена Ирина?)
        System.out.println("Муж Ирины");
        System.out.println(new Research(gt).spend(irina, Relationship.vife));

        // Ищем людей определенного возраста
        System.out.println(new Research(gt).searchAge());
    }
}
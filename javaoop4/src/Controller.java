package javaoop4.src;
import java.util.Scanner;

public class Controller {
    public static void run(){
        Task t1 = new Task("Купить ботинки", "Игорь", 3, "31.12");
        Task t2 = new Task();
        Task t3 = new Task("Позвать друзей", "Игорь", 3, "29.12");
        Task t4 = new Task("Купить джинсы", "Игорь", 1, "29.12");
        Task t5 = new Task("Зашить дырку", "Игорь", 2, "29.12");
        Planner myP = new Planner();
        myP.add(t1);
        myP.add(t2);
        myP.add(t3);
        myP.add(t4);
        myP.add(t5);
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner);
        add add = new add(scanner);
        UserInterface userInterface = new UserInterface(scanner, menu, myP, add);
        userInterface.start();
    }
}
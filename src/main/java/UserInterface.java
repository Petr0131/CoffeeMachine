import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("You want coffee?(y/n)");

        String e = in.next();

        switch (e) {
            case ("y") -> {
                CoffeeMachine.createCoffee();
                System.out.println("Coffee");
            }
            case ("n") -> System.out.println("no!");
            default -> System.out.println("Incorrect value");
        }
    }
}
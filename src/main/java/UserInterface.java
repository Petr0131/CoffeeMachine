import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("You want coffee?(y/n)");

        String e = in.next();

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        switch (e) {
            case ("y") -> {
                Coffee coffee = coffeeMachine.createCoffee();
                System.out.println(coffee.toString());
            }
            case ("n") -> System.out.println("no!");
            default -> System.out.println("Incorrect value");
        }
    }
}
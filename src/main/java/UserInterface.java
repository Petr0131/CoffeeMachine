import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Считывание объемов компонентов с условных датчиков кофемашины.
        CoffeeMachine coffeeMachine = new CoffeeMachine(500, 500, 200);

        String ch;

        do {
            System.out.println("You want coffee?(y/n)");

            ch = in.next();

            switch (ch) {
                case ("y") -> {
                    try{

                        Coffee coffee = coffeeMachine.createCoffee(); // Запрос на приготовление кофе
                        System.out.println(coffee.toString());

                    } catch (Exception e){

                        System.out.println(e.getMessage());

                    }
                }

                case ("n") -> System.out.println("Got it! Come back later!");

                default -> System.out.println("Incorrect value");
            }
        }
        while (ch.equals("y"));
    }
}
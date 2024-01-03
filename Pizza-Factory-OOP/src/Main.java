import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PizzaFactory factory = new PizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Scanner input = new Scanner(System.in);

        String pizzaType = null;
        boolean valid = false;

        do {
            try {
                System.out.println("What pizza would you like to order? ");
                pizzaType = input.nextLine().toLowerCase();
                Pizza pizza = store.orderPizza(pizzaType);

                System.out.println("We ordered a " + pizza.getName());
                System.out.println(pizza.toString());
                valid = true;
            } catch (Exception e) {
                System.out.println("Invalid pizza type. Please try again.");
            }
        } while (!valid);

    }
}


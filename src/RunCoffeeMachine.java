import java.util.Scanner;

public class RunCoffeeMachine {

    public static void main(String[] args) {


        CoffeeMaker coffeeMaker = new CoffeeMaker();

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please type a coffee you would like: ");
        String readUserInput = userInput.nextLine().toLowerCase();
        System.out.println(coffeeMaker.makeCoffee(readUserInput));

    }
}
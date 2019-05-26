import java.util.Scanner;

public class RunCoffeeMachine {

    public static void main(String[] args) {


        CoffeeMaker coffeeMaker = new CoffeeMaker();

        Coffee coffee = new Coffee();
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please type a coffee you would like: ");
        String readUserInput = userInput.nextLine().toLowerCase();
        coffee.setType(readUserInput);
//        System.out.println(coffeeMaker.whatType(readUserInput));
        System.out.println(coffeeMaker.makeCoffee(readUserInput));

    }
}
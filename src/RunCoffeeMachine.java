import java.util.Scanner;

public class RunCoffeeMachine {

    static String readUserInput;


    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        Coffee coffee = new Coffee();
        Scanner userInput = new Scanner(System.in);


        System.out.println("Please type a coffee you would like: ");
        readUserInput = userInput.nextLine().toLowerCase();
        coffee.setType(readUserInput);
        coffeeMaker.makeCoffee(readUserInput);
        System.out.println(coffeeMaker.whatType());




    }



}
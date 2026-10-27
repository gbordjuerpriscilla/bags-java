import java.util.Scanner;
//|Create a program display the menu of a resturant to a customer and create and array of customers

// display the customers with the food they ordered
public class Bags {


    public static void menu() {

        Scanner input = new Scanner(System.in);

        String[] menu = {
                "Fufu ",
                "Rice with stew",
                "Yam with Kotomire",
                "Jollof with chicken",
                "Kenkey with shito",
                "Wakye with gari and spagetti"
        };

        double[] prices = {
                50.00,
                80.00,
                70.00,
                100.00,
                40.00,
                65.00
        };
        System.out.println("==========Welcome to Prissy's food joint.====================");

        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + "." + menu[i] + "- $" + prices[i]);
        }
        System.out.println("==================================================");

        String[] customersNames = new String[4];
        String[] foodBought = new String[4];
        double[] amount = new double[4];

        for (int i = 0; i < customersNames.length; i++) {
            System.out.print("\nEnter name of customer " + (i + 1) + ":");
            customersNames[i] = input.nextLine();

            System.out.print("Enter the number of food you want : ");
            int choice = input.nextInt();
            input.nextLine();

            while (choice < 1 || choice > menu.length) {
                System.out.print("Invalid number. Enter a number from the menu: ");

                choice = input.nextInt();
                input.nextLine();
            }

            foodBought[i] = menu[choice - 1];
            amount[i] = prices[choice - 1];

        }

        double total = 0;
        System.out.println("=========================CUSTOMER ORDERS=======================");
        for (int i = 0; i < customersNames.length; i++) {
            System.out.println((i + 1) + "." + customersNames[i] + " bought " + foodBought[i] + " at $ " + amount[i]);
            total += amount[i];
        }
        System.out.println("=========================================================");
        System.out.println("Total : " + total);

//        System.out.println("How old are you?");
//        System.out.print
//        ( new Scanner(System.in).nextInt());
    }
}







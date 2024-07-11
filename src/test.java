import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class test {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-------------------- WELCOME TO FOODEASE!--------------------\n");

        // order
        Menu m = new Menu();
        int ans = 1;
        do {
            System.out.println("CATEGORIES");
            System.out.println("----------");
            System.out.println("1. Indian" + '\n' + "2. Italian" + '\n' + "3. Chinese" + '\n' + "4. Beverages" + '\n'
                    + "5. Desserts" + '\n' + "6. Exit");
            System.out.print("From which category would you like to order?");
            int choice = sc.nextInt();
            if (choice == 6) {
                System.exit(0);
            } else if (choice > 6) {
                System.out.println("Invalid choice");
                System.out.println("Choose again\n");
            } else {
                System.out.println("--------------------------------------------------------------------");
                System.out.println("                             MENU");
                System.out.println("--------------------------------------------------------------------");
                m.display(choice);
                System.out.println("Dish Added to list");
                System.out.println();
                System.out.println("Do you want to order anything else?" + '\n' + "1. YES" + '\n' + "2. NO");
                ans = sc.nextInt();
            }
        } while (ans == 1);

        // bill
        System.out.println("Your Total Bill Amount is: " + m.total);
        System.out.println();

        // details
        Details de = new Details();
        de.getDetails();
        de.storeDetails();

        // payment
        System.out.println("Enter your mode of payment:" + '\n' + "1. By cash" + '\n' + "2. By card");
        int mop = sc.nextInt();
        if (mop == 1) {
            System.out.println("\nOrder place successfully for " + de.name);
            System.out.println("Thank you for placing this order!");
            System.out.println("Enjoy your meal!");
            System.out.println("--------------------------------------------------------------------------");
        } else if (mop == 2) {
            Payment pay = new Payment();
            pay.setInfo();
            System.out.println("Click enter to pay");
            sc.nextLine();
            sc.nextLine();
            pay.storeDetails();
            System.out.println("Payment Successful!");
            System.out.println("Thank you for placing this order!");
            System.out.println("Enjoy your meal!");
            System.out.println("--------------------------------------------------------------------------");
        }

        sc.close();
    }
}

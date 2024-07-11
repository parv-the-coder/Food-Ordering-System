import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Payment {
    Scanner sc = new Scanner(System.in);
    long card_no;
    String card_name;
    String doe;
    int cvv;
    String type;

    void setInfo() {
        while (true) {
            System.out.println("Select Card type" + '\n' + "1. Credit Card" + '\n' + "2. Debit Card");
            int t = sc.nextInt();
            if (t == 1) {
                this.type = "Credit";
                break;
            } else if (t == 2) {
                this.type = "Debit";
                break;
            } else {
                System.out.println("Invalid Choice");
                System.out.println("Enter Again");
                System.out.println();
            }
        }
        while (true) {
            System.out.print("Enter Card No.:- ");
            this.card_no = sc.nextLong();
            if (Long.toString(card_no).length() == 12) {
                break;
            } else {
                System.out.println("Invalid Card Number");
                System.out.println("Enter Again");
            }
        }
        sc.nextLine();
        System.out.print("Enter Name on Card:- ");
        this.card_name = sc.nextLine();

        while (true) {
            System.out.print("Enter Expiry Date of Card:- ");
            this.doe = sc.next();
            if (doe.length() == 5) {
                if (doe.charAt(3) < '2' || doe.charAt(4) < '4') {
                    System.out.println("Invalid Card");
                    System.out.println("Enter Again");
                } else {
                    break;
                }
            } else {
                System.out.println("Invalid Card");
                System.out.println("Enter Again");
            }
        }
        while (true) {
            System.out.print("Enter CVV (Your CVV will not be stored):- ");
            this.cvv = sc.nextInt();
            if (Integer.toString(cvv).length() == 3) {
                break;
            } else {
                System.out.println("Invalid CVV");
                System.out.println("Enter Again");
            }
        }
    }

    void storeDetails() throws IOException {
        BufferedWriter writer = new BufferedWriter(
                new FileWriter("D://Food-Ordering-System//src//Text//card.txt", true));
        writer.write("Type: " + type);
        writer.newLine();
        writer.write("Card Number: " + card_no);
        writer.newLine();
        writer.write("Name: " + card_name);
        writer.newLine();
        writer.write("Expiry Date: " + doe);
        writer.newLine();

        writer.close();
    }

}

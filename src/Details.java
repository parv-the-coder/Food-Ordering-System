import java.io.*;
import java.util.*;

public class Details {
    Scanner sc = new Scanner(System.in);
    String name;
    String address;
    long ph_no;

    void getDetails() {
        System.out.print("Kindly Enter your Name:- ");
        this.name = sc.nextLine();
        while (true) {
            System.out.print("Enter your Phone Number:- ");
            this.ph_no = sc.nextLong();
            if (Long.toString(ph_no).length() == 10) {
                break;
            } else {
                System.out.println("Invalid Phone Number");
                System.out.println("Enter Again");
            }
        }
    }

    void storeDetails() throws IOException {
        BufferedWriter writer = new BufferedWriter(
                new FileWriter("D://Food-Ordering-System//src//Text//details.txt", true));
        writer.write("Name:" + name);
        writer.newLine();
        writer.write("Phone Number:" + Long.toString(ph_no));
        writer.newLine();
        writer.close();
    }
}
import java.util.Scanner;
import java.lang.*;
import static java.lang.System.*;


public class Exercise10 {
    public static void main(String[] args) {

        System.out.println("Enter the price of item 1: ");
        Scanner input = new Scanner(in);
        String item1 = input.nextLine();
        double x1 = Double.parseDouble(item1);

        System.out.println("Enter the quantity of item 1: ");
        Scanner input2 = new Scanner(in);
        String quantity1 = input2.nextLine();
        double y1 = Double.parseDouble(quantity1);

        double price1 = x1 * y1;

        System.out.println("Enter the price of item 2: ");
        Scanner input3 = new Scanner(in);
        String item2 = input3.nextLine();
        double x2 = Double.parseDouble(item2);


        System.out.println("Enter the quantity of item 2: ");
        Scanner input4 = new Scanner(in);
        String quantity2 = input4.nextLine();
        double y2 = Double.parseDouble(quantity2);

        double price2 = x2 * y2;

        System.out.println("Enter the price of item 3: ");
        Scanner input5 = new Scanner(in);
        String item3 = input5.nextLine();
        double x3 = Double.parseDouble(item3);

        System.out.println("Enter the quantity of item 3:");
        Scanner input6 = new Scanner(in);
        String quantity3 = input6.nextLine();
        double y3 = Double.parseDouble(quantity3);

        double price3 = x3 * y3;

        double total = price1 + price2 + price3;
        double tax = total * .055;
        double ftotal = total + tax;
        double total_rounded = Math.round(total*100.0)/100.0;
        double tax_rounded = Math.round(tax*100.0)/100.0;
        double ftotal_rounded = Math.round(ftotal*100.0)/100.0;

        System.out.println("Subtotal: " +  total_rounded);
        System.out.println("Tax: " + tax_rounded);
        System.out.println("Total: " + ftotal_rounded);
    }
}
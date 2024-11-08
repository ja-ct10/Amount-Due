package runamountdue;
import java.util.Scanner;
public class RunAmountDue {

    public static void main(String[] args) {
    AmountDue due = new AmountDue();
    Scanner sc = new Scanner (System.in);

    System.out.println("Press any of the following then enter values separated by spaces:");
    System.out.println("1 - Price only \n2 - Price and quantity \n3 - Price, quantity, and discount amount");
    int choices = sc.nextInt();
    
    switch(choices){
        case 1:
            double price = sc.nextDouble();
            System.out.println("Amount due is " + due.computeAmountDue(price));
            break; 
        case 2:
            price = sc.nextDouble();
            int quantity = sc.nextInt();
            System.out.println("Amount due is " + due.computeAmountDue(price, quantity));
            break; 
        case 3:
            price = sc.nextDouble();
            quantity = sc.nextInt();
            double discountAmount = sc.nextDouble();
            System.out.println("Amount due is " + due.computeAmountDue(price, quantity, discountAmount));
            break;       
    }
    }
}

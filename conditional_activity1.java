import java.util.Scanner;
public class conditional_activity1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       double change = 0;
        System.out.print("Enter the item code: ");
        String item = input.next();
        input.nextLine();
        System.out.print("Enter No. of item: ");
        int numitems = input.nextInt();
        input.nextLine();
        System.out.print("Enter Item Price: ");
        double price = input.nextDouble();
       
        System.out.print("Amount Tendered: ");
        double amount = input.nextDouble();

        double total = price * numitems;
        double vat =  total * 0.06;
        double totalCost = total + vat;
       
        
        if (amount < totalCost) {
            System.out.println("Your Payment is not enough");
        }
        else{
         change = amount - totalCost;
        }

        System.out.println("Item Code      No. of Item      Item Price       Total ");
        System.out.printf(" %s            %d               %.2f           %.2f ",item, numitems, price, total );
        System.err.println(" ");
        System.err.println(" ");
        System.out.printf("Vat: %.2f",vat);
        System.out.println();
        System.out.println("Total Cost: "+ totalCost);
        System.out.println("Amount Tendered: "+amount);
        System.out.printf("Amount Change: %.2f",change);

        input.close();
    } 
}


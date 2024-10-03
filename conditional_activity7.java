import java.util.Scanner;

public class conditional_activity7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("Enter third number: ");
        double num3 = input.nextDouble();

      
        double largest = num1;
        double smallest = num1;

      
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

     
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

      
        System.out.printf("Largest Number: %.2f%n", largest);
        System.out.printf("Smallest Number: %.2f%n", smallest);

        input.close();  
    }
}

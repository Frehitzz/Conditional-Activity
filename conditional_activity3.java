import java.util.Scanner;

public class conditional_activity3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = input.nextInt();

       
        if (number % 2 == 0) {
            System.out.println(number + " is an EVEN number.");
        } else {
            System.out.println(number + " is an ODD number.");
        }

        input.close();
    }
}
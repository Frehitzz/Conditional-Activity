import java.util.Scanner;
public class conditional_activity6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to determine if postive or negative: ");
         double number = input.nextDouble();

         if (number < 0) {
            System.out.println("The number you input is NIGGATIVE");
         }else if (number >= 101) {
            System.out.println("Number greater than 100");
         } else if (number == 100){
            System.out.println("Number is 100");
         } else if (number >= 11){
            System.out.println("Number is greater than 10");
         } else if (number == 10){
            System.out.println("Number is 10");
         } else if (number <= 9){
            System.out.println("Number is less than 10");
         } 
         input.close();
    }
}

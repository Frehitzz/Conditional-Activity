import java.util.Scanner;
public class conditional_activity4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = input.nextLine();
                                                             
        System.out.print("Enter your Monthly Salary: ");
        double salary = input.nextInt();

        double bonus;
        if (salary <= 7000) {
         bonus = salary * 0.50;
        }else{
            bonus = 7000;
        }
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.printf("Monthly Salary: %.2f%n", salary);
        System.out.printf("Year-End Bonus: %.2f%n", bonus);

        input.close();
    }
    
}

import java.util.Scanner;

public class conditional_activity5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter room number: ");
        int roomNumber = scanner.nextInt();

        System.out.print("Enter room capacity: ");
        int capacity = scanner.nextInt();

        System.out.print("Enter no. of students enrolled: ");
        int enrolled = scanner.nextInt();

       
        int emptySeats = capacity - enrolled;

       
        if (enrolled <= capacity) {
            System.out.println("Empty seats: " + emptySeats);
            System.out.println("Status: Available");
        } else {
            System.out.println("Empty seats: 0");
            System.out.println("Status: Full");
        }

        scanner.close();
    }
}
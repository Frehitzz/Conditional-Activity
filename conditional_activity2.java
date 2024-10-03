import java.util.Scanner;
public class conditional_activity2 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Input time in seconds: ");
    int second = input.nextInt();

    int minutes = (second % 3600) / 60;
    int remainsec = second % 60;

    System.out.println("The time in minutes is: "+minutes+" minutes");
    System.out.println("The time in second is: "+remainsec+" seconds");
    input.close();
   }  
}

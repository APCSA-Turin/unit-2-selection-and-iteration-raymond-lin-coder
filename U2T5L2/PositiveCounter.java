package U2T5L2;
import java.util.Scanner;
public class PositiveCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer greater than 5: ");
        int integer = scan.nextInt();
        while (integer <= 5) {
            System.out.print("Try again: ");
            integer = scan.nextInt();
        }
        int count = 0;
        while (count < integer) {
            System.out.println(count);
            count++;
        }
        System.out.println("and finally " + integer);
        scan.close();
    }
}

package U2T5L2;

import java.util.Scanner;

public class HalveTo1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("What number do you want to halve to one? ");
    int userNumber = scanner.nextInt();
    int initialNumber = userNumber;
    int halvedTimes = 0;
    while (userNumber > 1) {
      userNumber /= 2;
      System.out.println(userNumber);
      halvedTimes++;
    }
    System.out.println("It takes " + halvedTimes + " halvings to get from " + initialNumber + " to 1.");
    scanner.close();
  }
}


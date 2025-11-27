package U2T5L2;

public class SnakeEyes {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int rollNumber = 1;
        while (num1 != 1 || num2 != 1) {
            num1 = (int) ((Math.random() * 6) + 1);
            num2 = (int) ((Math.random() * 6) + 1);
            System.out.println("Roll #" + rollNumber + ": " + num1 + " and " + num2);
            rollNumber++;
            if (num1 != 1 || num2 != 1) {
                System.out.println("Not snake eyes, rolling again!");
            } else {
                System.out.println("Finally, snake eyes!");
            }
        }
    }
}

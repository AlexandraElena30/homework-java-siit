package HomeworkWeek2;

import java.util.Scanner;

public class MaxDigitFromNumber {
    public static void main(String[] args) {

        {
            int max = 0;
            int min = 9;
            System.out.println("Enter the number: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();

            while (number != 0) {
                int r = number % 10;

                max = Math.max(r, max);

                min = Math.min(r, min);
                number = number / 10;
            }
            System.out.println("The max digit from number is: " + max );
        }
    }
}


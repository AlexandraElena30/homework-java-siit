package HomeworkWeek2;

import java.util.Scanner;

public class PalindromNumbers {
    public static void main(String[] args) {

        int sum = 0;
        int remainder ;
        System.out.println("Enter the number you wish to check: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int number = num;

        while( num > 0 ){
            remainder = num % 10;
            sum = ( sum * 10 ) + remainder;
            num = num / 10;
        }
        if ( sum == number){
            System.out.println( number + " is palindrome");
        } else {
            System.out.println( number + " is not palindrome");
        }

    }
}

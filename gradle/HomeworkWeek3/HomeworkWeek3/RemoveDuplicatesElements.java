package HomeworkWeek3;

import java.util.Scanner;

public class RemoveDuplicatesElements {

    static int removeDuplicates(int[] numbers, int n) {

        if (n==0 || n==1) {
            return n;
        }

        int[] temp = new int[n];
        int j = 0;

        for (int i=0; i<n-1; i++){
            if (numbers[i] != numbers[i+1]) {
                temp[j++] = numbers[i];
            }
        }
        temp[j++] = numbers[n-1];

        if (j >= 0) System.arraycopy(temp, 0, numbers, 0, j);


        return j;
    }

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");

        int length = scanner.nextInt();
        int[] numbers = new int[length];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int n = numbers.length;

        n = removeDuplicates(numbers, n);

        for (int i=0; i<n; i++)
            System.out.print(numbers[i]+" ");
    }
}



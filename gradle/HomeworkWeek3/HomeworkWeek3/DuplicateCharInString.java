package HomeworkWeek3;

import java.util.Scanner;

public class DuplicateCharInString {

    public static String noDuplicates(String s) {

        StringBuilder str = new StringBuilder();
        int len = s.length();

        for (int i = 0; i < len; i++)
        {
            char c = s.charAt(i);
            if (str.toString().indexOf(c) < 0) {
                str.append(c);
            }
        }
        return str.toString();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: " );
        String s = scanner.next();

        System.out.println(noDuplicates(s));
    }
}

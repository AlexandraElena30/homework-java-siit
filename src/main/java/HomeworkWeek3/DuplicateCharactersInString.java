package HomeworkWeek3;
import java.util.Scanner;

public class DuplicateCharactersInString {
    public static void main(String[] args) {
        String s = "aaabbbaccaddefgbeAAEGVX";
        char x[]=s.toCharArray();
        int nr[]=new int[50];
        for(int i=0;i<x.length-1;i++)
            for(int j=i+1;j<x.length;j++){
                if(x[i]==x[j] && (int)x[i]<97)
                    nr[(int)x[i]-65] = 1;

                if(x[i]==x[j] && (int)x[i]>=97)
                    nr[(int)x[i]-97+25] = 1;
                }
                for (int i=0;i<50;i++) {
                    if (i < 25)
                        if (nr[i] == 1)
                            System.out.println((char)(i+65));
                    if (i >= 25)
                        if (nr[i] == 1)
                            System.out.println((char)(i+72));
                }
    }

}

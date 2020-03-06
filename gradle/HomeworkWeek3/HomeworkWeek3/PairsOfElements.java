package HomeworkWeek3;
import java.util.Scanner;


public class PairsOfElements {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n=4;int sum=10;
    int a[]=readArray(n,scanner);
    pairs(a,n,sum);
    }

    public static int[]  readArray(int n,Scanner scanner){
        int a[]= new int[n];
        System.out.println("Enter array:");
        for (int i = 0; i < n; i++)
            a[i]=scanner.nextInt();
        return a;
    }
    public static void pairs(int a[],int n,int sum){
        System.out.println("The pairs are:");
        for(int i=0;i<n-1;i++)
            for (int j=i+1;j<n;j++)
                if (a[i]+a[j]==sum)
                    System.out.println(a[i]+" "+a[j]);

    }

}

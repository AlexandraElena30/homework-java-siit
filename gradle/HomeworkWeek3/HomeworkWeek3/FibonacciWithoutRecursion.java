package HomeworkWeek3;

public class FibonacciWithoutRecursion {
    public static void main(String[] args) {

        fibonacci(10);
    }
    public static void fibonacci(int num){
        for(int i = 0; i <= num; i++){
            System.out.println(getFibonacci(i));
        }
    }

    public static int getFibonacci(int n){
        if (n == 0) {
            return 0;
        }else if (n == 1){
            return 1;
        }
        int first = 0;
        int second = 1;
        int x = 1;

        for (int i = 2; i <= n; i++) {
            x = first + second;
            first = second;
            second = x;
        }
        return x;
    }
}

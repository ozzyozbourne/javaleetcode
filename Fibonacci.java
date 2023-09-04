public final class Fibonacci {

    private Fibonacci(){}

    public static void main(String[] args){
        System.out.printf("%d\n", fib(4));
        System.out.printf("%d\n", fib(5));
        System.out.printf("%d\n", fib(6));
    }

    public static int fib(int n){
        if(n == 1 || n == 0)return n;
        return fib(n-1) + fib(n-2);
    }

}

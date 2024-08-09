package chapter02;

public class Fibonacci {
    private static int fibo(int n) {
        //수학적 표현을 보고 구현
        if(n == 1) return 0;
        if(n == 2) return 1;
        return fibo(n - 2) + fibo(n - 1);

    }

    public static void main(String[] args) {
        for (int i = 1; i < 15; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}

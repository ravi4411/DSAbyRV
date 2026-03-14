package dsa1.recursion;

public class Fibonacci {
    public static void main(String[] args){
        int ans = fibo(9);
    System.out.println(ans);
    }

    static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}

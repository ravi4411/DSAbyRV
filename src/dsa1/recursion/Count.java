package dsa1.recursion;

//Count No. of zeroes in a number
public class Count {
    public static void main(String[] args){
    System.out.println(count(3020040));
    }
    static int count(int n){
        if(n==0){
            return 1;
        }
        return helper(n,0);
    }

    private static int helper(int n, int c){
        if(n==0){
            return c;
        }
        int rem = n%10;
        if(rem ==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}

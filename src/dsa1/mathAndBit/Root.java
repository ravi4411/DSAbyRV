package dsa1.mathAndBit;

//Find square root of a number upto given precision using search
public class Root {
    public static void main(String[] args){
    System.out.println(squareRoot(50,3));
    }
    static float squareRoot(int number, int precision){
        int start = 0, end = number;
        int mid;
        double ans = 0.0;

        while (start<end){
            mid = start+(end-start)/2;
            if(mid*mid==number){
                ans=mid;
                break;
            }
            if(mid*mid<number){
                start = mid+1;
                ans =mid;
            }else {
                end = mid-1;
            }
        }

        double increament= 0.1;
        for (int i=0;i<precision;i++){
            while (ans*ans <= number){
                ans += increament;
            }
            ans = ans-increament;
            increament =increament/10;
        }
        return (float) ans;
    }
}

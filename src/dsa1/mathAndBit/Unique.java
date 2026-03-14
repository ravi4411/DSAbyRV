package dsa1.mathAndBit;

//you are give an array every number appear twice and one appear once you have to find that number
public class Unique {
    public static void main(String[] args){
        int[] arr = {2,3,4,1,2,1,3,6,4};
    System.out.println(unique(arr));
    }

    static int unique(int[] arr){
        int ans = 0;
        for(int n:arr){
            ans ^=n;
        }
        return ans;
    }
}

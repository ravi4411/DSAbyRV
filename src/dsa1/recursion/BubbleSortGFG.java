package dsa1.recursion;

import java.util.Arrays;

public class BubbleSortGFG {
    public static void main(String[] args){
        int[] arr = {64,34,25,12,22,81,90,2,1,0,-2,-9,-8,-1};
        bubble(arr,arr.length);
    System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr, int n){
        //Base
        if(n==1){
            return;
        }
        int count =0;
        //one pass of bubble sort after this pass , the largest element is moved to end
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                count = count+1;
            }

        }
        //check if any recursion happens or not
        //if any recursion is not happen then return
        if (count==0){
            return;
        }
        //largest element fixed recur the remaining
        bubble(arr,n-1);
    }
}

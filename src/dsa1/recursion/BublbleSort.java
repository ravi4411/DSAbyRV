package dsa1.recursion;

import java.util.Arrays;

public class BublbleSort {
    public static void main(String[] args){
        int[] arr = {4,3,2,1};
        bubble(arr,arr.length-1,0);
    System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr, int e, int s){
        if(e==0){
            return;
        }

        if(s<e){
            if(arr[s]<arr[s+1]){
                //swap
                int temp = arr[s];
                arr[s]=arr[s+1];
                arr[s+1]=temp;
            }
            bubble(arr,s,s+1);
        }else {
            bubble( arr,e-1,0);
        }
    }
}

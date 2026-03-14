package dsa1.recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {64,34,25,12,22,81,90,2,1,0,-2,-9,-8,-1};
        selection(arr,arr.length,0,0);
    System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr, int r, int c, int max){
        if(r==1){
            return;
        }
        if(c<r){
            if(arr[c]>arr[max]){
                selection(arr,r,c+1,c);
            }
            else {
                selection(arr,r,c+1,max);
            }
        }else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1]=temp;
            selection(arr,r-1,0,0);
        }
    }
}

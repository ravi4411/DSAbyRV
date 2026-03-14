package dsa1.Sorting;

import java.util.Arrays;

// find min/max element in array and place at the first/last
public class SelectionSort {

  public static void main(String[] args) {
    int[] arr = {64, 25, 12, 22, 11, 6, 8, 9, 0, -9, -8};
    selection(arr);
    System.out.println(Arrays.toString(arr));
  }
    // we are choosing the approach of putting the min element at first
//  private static void selection(int[] arr){
//      for(int i=0;i<arr.length-1;i++){
//          int min_idx = i;
//          for(int j = i+1;j<arr.length;j++){
//              if(arr[j]<arr[min_idx]){
//                  min_idx=j;
//              }
//          }
//          int temp = arr[min_idx];
//          arr[min_idx]=arr[i];
//          arr[i]=temp;
//      }


    // we are choosing the approach of putting the max element at Last
    private static void selection(int[] arr){
      int n = arr.length;
    for(int end=n-1;end>0;end--){
        int max_idx = 0;
        for (int j=1;j<=end;j++){
            if(arr[j]>arr[max_idx]){
                max_idx=j;
            }
        }
        int temp = arr[max_idx];
        arr[max_idx]=arr[end];
        arr[end]=temp;
    }

    }
}

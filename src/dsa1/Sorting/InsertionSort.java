package dsa1.Sorting;

import java.util.Arrays;
//Insertion sort is a simple sorting algo that works by building a sorted array one element at a time
public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = {4, 5, 1, 2, 3, 8, 9, 0, 3};
    insertion(arr);
    System.out.println(Arrays.toString(arr));
  }

  private static void insertion(int[] arr){
      for(int i=0;i<arr.length-1;i++){
          for (int j = i+1;j>0;j--){
              if(arr[j]<arr[j-1]){
                  int temp = arr[j-1];
                  arr[j-1] = arr[j];
                  arr[j] = temp;
               }else {
                  break;
              }
          }
      }
  }
}

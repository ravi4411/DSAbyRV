package dsa1.Sorting;

import java.util.Arrays;

// When given Numbers 1 to N use Cyclic sort
public class CycleSort {
  public static void main(String[] args) {
    int[] arr = {5, 4, 3, 2, 1};
    cycle(arr);
    System.out.println(Arrays.toString(arr));
  }

  private static void cycle(int[] arr){
      int i = 0;
      while(i<arr.length){
          int correct =arr[i]-1;
          if(arr[i] != arr[correct]){
              int temp = arr[correct];
              arr[correct] =arr[i];
              arr[i]=temp;
          }
          else {
              i++;
          }
      }
  }
}

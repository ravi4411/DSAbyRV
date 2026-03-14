package dsa1.binarySearch;

/*Binary search algorithm is a searching algorithm used in a sorted array
by repeatedly dividing the search interval in half .
The idea of binarySearch is to use the information , that the array is sorted and
reduce the time complexity to O(longN). */

public class BinarySearch {
  public static void main(String[] args) {

    int[] arr = {-18,-12,-4,0,2,3,4,15,16,22,89};
    int target = 2;
    int ans = bs(arr,target);
    System.out.println(ans);
  }

    private static int bs(int[] arr, int target) {

      int start = 0;
      int end = arr.length-1;

      while(start<=end){
          int mid = start +(end-start)/2;
          if (arr[mid]<target){
              start = mid+1;
          } else if(arr[mid]>target){
              end = mid-1;
          }else {
              return mid;
          }
      }
      return -1;
    }
}

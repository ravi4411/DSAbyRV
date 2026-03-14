package dsa1.binarySearch;

// means we don't know array is sorted in asc or desc
public class OrderAgnosticBS {
  public static void main(String[] args) {
    //int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 22, 89};
      int[] arr = {9,8,6,4,3,2};
    int target = 4;
    int ans = orderAgno(arr, target);
    System.out.println(ans);
  }

  private static int orderAgno(int[] arr, int target) {
      int start = 0;
      int end = arr.length -1;

      boolean isAsc = arr[start]<arr[end];

      while (start<=end){
          int mid = start+(end-start)/2;
          if(arr[mid]==target){
              return mid;
          }
          if(isAsc){
              if(target<arr[mid]){
                  end = mid-1;
              }else {
                  start = mid+1;
              }
          }else{
              if(target<arr[mid]){
                  start = mid+1;
              }else {
                  end = mid-1;
              }
          }
      }
      return -1;
  }
}

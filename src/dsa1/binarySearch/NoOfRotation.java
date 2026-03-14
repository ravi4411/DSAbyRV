package dsa1.binarySearch;

// Find the rotation count in rotation sorted array
public class NoOfRotation {
  public static void main(String[] args) {
    int[] arr = {15, 18,19, 2, 3, 6, 12};
    System.out.println(search(arr));
  }

  private static int search(int[] arr){
      int start = 0 ;
      int end = arr.length-1;
      int n = end;
      while (start<=end){
          //if first element is mid or last element is mid
          //then simply use modulo so it never goes out of bound

          int mid = start + (end-start)/2;
          int prev = (mid-1+n)%n;
          int next = (mid+1)%n;

          if(arr[mid]<=arr[prev] && arr[mid]<=arr[next])
              return mid;
          else if(arr[mid]<=arr[end])
              end = mid;
          else if(arr[mid] >= arr[start])
              start = mid+1;


      }
      return 0;

  }
}

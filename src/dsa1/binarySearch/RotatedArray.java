package dsa1.binarySearch;

// Search in sorted Rotated Array
public class RotatedArray {
  public static void main(String[] args) {
    int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
    int target = 4;
    System.out.println(search(arr, target));
  }

  private static int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;

      // case 1: if the middle element is target
      if (nums[mid] == target) {
        return mid;
      }

      // case 2: Left half is sorted
      if (nums[left] <= nums[mid]) {

        // if the target is in sorted left half
        if (target >= nums[left] && target < nums[mid]) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      }

      // case 3: right half is sorted
      else {
        // if the target is in the sorted right half
        if (target > nums[mid] && target <= nums[right]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }
    return -1;
  }
}

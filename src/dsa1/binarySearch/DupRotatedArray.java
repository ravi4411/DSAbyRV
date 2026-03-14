package dsa1.binarySearch;

//Search element in a sorted and rotated array with duplicates
public class DupRotatedArray {
    public static void main(String[] args){
        int[] arr = {3,3,4,5,5,5,5,7,8,9,1,3,5};
        int target = 5;
    System.out.println(search(arr,target));

    }

    private static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start +(end-start)/2;
            if (arr[mid]==target){
                return mid;
            }
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                //it may happen in case of duplicates
                ++start;
                ++end;
                continue;
            }

            if(arr[start] <= arr[mid]){
                if(target >= arr[start] && target<arr[mid]){
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
            else {
                if(target <= arr[end] && target>arr[mid]){
                    start = mid+1;
                }else {
                    end = mid-1;
                }
            }
        }
        return -1;

    }

}

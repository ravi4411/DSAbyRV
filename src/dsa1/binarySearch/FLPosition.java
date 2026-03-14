package dsa1.binarySearch;

import java.util.Arrays;

//First and last position of element in sorted array.
public class FLPosition {
    public static void main(String[] args){
        int[] nums = {5,7,7,8,9,22,22,78,100,122,122};
        int target = 5;
        int[] arr = searchRange(nums,target);
    System.out.println(Arrays.toString(arr));
    }

    private static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] = search(nums,target,true);
        if(ans[0] != -1){
            ans[1] = search(nums, target, false);
        }
        return  ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<nums[mid]){
                end = mid-1;
            }else if(target>nums[mid]){
                start = mid+1;
            }else{
                ans = mid;

                //potential ans found
                if(findStartIndex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}

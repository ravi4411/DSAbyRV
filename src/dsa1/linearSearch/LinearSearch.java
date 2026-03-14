package dsa1.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {0,1,2,36,4,85,6,7,80,9,-3,-5,-7,-9};
        int target = -7;
        int index = linearSearch(arr, target);
        System.out.println(index);
        System.out.println(arr[index]);
    }
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

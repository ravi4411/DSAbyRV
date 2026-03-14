package dsa1.recursion;

//Linear search using recursion
public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {2,3,5,6,7,8,89,10};
        int target=1;
    System.out.println(findIndex(arr,target,0));
    }
    static int findIndex(int[] arr, int target, int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findIndex(arr,target,index+1);
    }
}

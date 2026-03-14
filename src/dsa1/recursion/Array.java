package dsa1.recursion;

//Check Array is sorted or not
public class Array {
    public static void main(String[] args){
        int[] arr = {2,3,5,6,7,8,89,10};
    System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[] arr, int index){
        //base condition
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
}

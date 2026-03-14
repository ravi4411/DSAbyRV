package dsa1.linearSearch;

//Find the no. of nos. of that have even no. of digits;
public class EvenDigits {
    public static void main(String[] args) {
        int count = 0;

        int[] nums = {18,123,5,1678,89,1,22,9876,9,-98,-7689};
    //System.out.println(findNumbers(nums));
        for(int num:nums){
            num = Math.abs(num);
            int digit = (int)Math.log10(num)+1;
            if(digit%2==0){
                count++;
            }
        }

        System.out.println(count);
  }

//  public static int findNumbers(int[] nums){
//        int count = 0;
//       for(int num:nums){
//           num = Math.abs(num);
//           if(even(num)){
//               count++;
//           }
//       }
//       return count;
//  }
//
//  static  boolean even(int num){
//        int noOfDigits = digit(num);
//        return noOfDigits%2==0;
//  }
//
//  static  int digit(int num){
//        int count = 0;;
//        while(num>0){
//            count++;
//            num/=10;
//        }
//        return count;
//  }
}

package dsa1.linearSearch;

// Find the max wealth of a person
public class maxWealth {
  public static void main(String[] args) {

    int[][] arr = {{1, 5}, {1, 7, 9}, {3, 9}};
    System.out.println(find(arr));
  }

  static int find(int[][] accounts){
      int max = 0;

      for(int persion = 0; persion < accounts.length; persion++){
          int sum = 0;
          for(int account = 0; account < accounts[persion].length; account++){
              sum += accounts[persion][account];
          }
          if(sum > max){
              max = sum;
          }
      }

      return max;
  }
}

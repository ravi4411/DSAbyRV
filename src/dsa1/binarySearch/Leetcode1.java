package dsa1.binarySearch;

public class Leetcode1 {
  public static void main(String[] args) {
    char[] letters = {'a', 'f', 'j', 's'};
    char target = 'm';
    int ans = nextGreaterChar(letters, target);
    System.out.println(letters[ans]);
  }

  private static int nextGreaterChar(char[] letters, char target) {

    int start = 0;
    int end = letters.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (target < letters[mid]) {
        end = mid - 1;
      } else if (target > letters[mid]) {
        start = mid + 1;
      }
    }
    return start%letters.length;
  }
}

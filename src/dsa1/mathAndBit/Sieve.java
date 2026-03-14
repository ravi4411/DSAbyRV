package dsa1.mathAndBit;

// find the prime numbers in a range but with the complexity og O(nlongn)
// Note:- if there is a prime number so the multiple of that number couldn,t be prime number so that
//        we can eliminate those numbers which are multiple
public class Sieve {
  public static void main(String[] args) {
    int n = 1000;
    boolean[] primes = new boolean[n + 1];
    seive(n, primes);
  }

  // false in array means numbers is prime
  static void seive(int n, boolean[] primes) {
    for (int i = 2; i * i <= n; i++) {
      if (!primes[i]) {
        for (int j = i * 2; j <= n; j += i) {
          primes[j] = true;
        }
      }
    }

    for (int i = 2; i <= n; i++) {
      if (!primes[i]) {
        System.out.println(i + " ");
      }
    }
  }
}

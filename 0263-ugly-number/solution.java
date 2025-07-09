import java.util.*;

class Solution {
    public static boolean isUgly(int n) {
        if (n <= 0) return false; // Ugly numbers must be positive

        int[] primes = {2, 3, 5};
        for (int prime : primes) {
            while (n % prime == 0) {
                n /= prime;
            }
        }

        return n == 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(isUgly(n));
    }
}

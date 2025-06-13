import java.util.Scanner;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[128];
        int max = 0;
        int start = 0;
        for (int i = 0; i < 128; i++) {
            lastSeen[i] = -1; 
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (lastSeen[ch] >= start) {
                start = lastSeen[ch] + 1;
            }
            lastSeen[ch] = i;
            int len = i - start + 1;
            if (len > max) {
                max = len;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}


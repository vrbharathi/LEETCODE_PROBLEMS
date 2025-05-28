import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int t=x;
        if(x<0)
        return false;
        while(x!=0){
            int r=x%10;
            rev=(rev*10)+r;
            x/=10;
        }
        if(t==rev){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        Solution sl=new Solution();
        sl.isPalindrome(x);
    }
}

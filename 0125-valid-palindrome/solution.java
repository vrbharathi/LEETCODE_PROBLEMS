class Solution {
    public static boolean isPalindrome(String s) {
        boolean flag=true;
        s = s.toLowerCase();
        String rc = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                rc += c;
            }
        }
        for(int i=0;i<rc.length();i++){
                if(rc.charAt(i)!=rc.charAt(rc.length()-i-1)){
                     flag=false;
                     break;
                }
            
        }
        return flag;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean result=isPalindrome(s);
        if(result==true){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}

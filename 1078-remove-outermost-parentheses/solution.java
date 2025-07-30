class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res=new StringBuilder();
        int N=s.length();
        int c=0;
        for(int i=0;i<N;i++){
            if(s.charAt(i)=='('){
                if(c>0)
                res.append(s.charAt(i));
            c++;
            }
            else{
                c--;
                if(c>0)
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}

class Solution {
    public String removeStars(String s) {
        int len=0;
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch!='*'){
                sb.append(ch);
                len++;
            }
            else if(len>0){
                sb.setLength(--len);
            }
        }
       return sb.toString();
    }
}

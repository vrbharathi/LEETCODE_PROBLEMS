class Solution {
    public static int fib(int n) {
        int a=0,b=1,c=0;
        if(n==0) return 0;
        if(n==1) return 1;
        for(int i=2;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(fib(n));
    }
}

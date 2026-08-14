class Solution {
    public int fib(int n) {
        int f=0;
        int s=1;
        for(int i=1;i<=n;i++){
            int third=f+s;
            f=s;
            s=third;
        }return f;
    }
}
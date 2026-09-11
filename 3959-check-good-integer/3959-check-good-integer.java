class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0,srt=0;
        while(n!=0){
            int digit=n%10;
            sum=sum+digit;
            srt=digit*digit+srt;
            n=n/10;
        }
        int minus=srt-sum;
       return minus>=50?true:false;
    }
}
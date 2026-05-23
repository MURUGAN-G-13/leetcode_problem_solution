class Solution {
    public int alternateDigitSum(int n) {
        String s=String.valueOf(n);
        int sum=0;
        int sign=1;
        for(int i=0;i<=s.length()-1;i++){
            int digit=s.charAt(i)-'0';
            sum =sum+ sign*digit;
            sign = -sign;
        }
        return sum;
    }
}
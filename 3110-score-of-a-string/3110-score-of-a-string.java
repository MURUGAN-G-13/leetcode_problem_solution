class Solution {
    public int scoreOfString(String s) {
        int minus=0;
    for(int i=0;i<s.length()-1;i++){
        int str1=s.charAt(i);
        int str2=s.charAt(i+1);
        int  abs=Math.abs(str1-str2);
       minus+=abs;
    }
        return minus;
    }
}
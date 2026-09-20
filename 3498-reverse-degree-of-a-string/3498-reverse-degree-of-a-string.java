class Solution {
    public int reverseDegree(String s) {
        int reverse=0;
        int x=1;
        for(char ch=0;ch<s.length();ch++){
            char c=s.charAt(ch);
             reverse = reverse +(122-c+1)*x;
             x++;
        }
        return reverse;
    }
}
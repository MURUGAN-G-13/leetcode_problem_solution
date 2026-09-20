class Solution {
    public int reverseDegree(String s) {
        int reverse=0;
        int x=1;
        for(char ch=0;ch<s.length();ch++){
            char c=s.charAt(ch);
             reverse = reverse +(123-c)*x;
             x++;
        }
        return reverse;
    }
}
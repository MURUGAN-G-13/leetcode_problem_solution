class Solution {
    public int minimizedStringLength(String s) {
        int count =0;
        for(char ch='a';ch<='z';ch++){
            if(s.indexOf(ch)!=-1){
                count++;
            }
        }return count;
    }
}
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        for(String i:words){
           if(i.startsWith(pref,0)){
                count++;
           }
        }return count;
    }
}
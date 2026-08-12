class Solution {
    public String truncateSentence(String s, int k) {
        String[] str=s.split(" ");
        StringBuilder truncateSentence=new StringBuilder();
        for(int i=0;i<k-1;i++){
            truncateSentence.append(str[i]+" ");
        }
        truncateSentence.append(str[k-1]);
        return truncateSentence.toString();
    }
}
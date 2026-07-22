class Solution {
    public int maxDepth(String s) {
         int ans=0;
         int ob=0;
         for(char c:s.toCharArray()){
            if(c=='('){
                ob++;
            }else if(c==')'){
                ob--;
            }
            ans=Math.max(ans,ob);
         } return ans;  
    }
}
class Solution {
    public int findClosestNumber(int[] nums) {
int ans=Integer.MAX_VALUE;
int space=Integer.MAX_VALUE;
for(int num:nums){
    if(Math.abs(num)<space){
        space=Math.abs(num);
        ans=num;
    }else if(num==space){
        ans=Math.max(ans,space);
    }
}
   return ans;   
}
}
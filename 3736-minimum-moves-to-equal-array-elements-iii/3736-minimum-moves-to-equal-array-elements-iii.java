class Solution {
    public int minMoves(int[] nums) {
  int move=nums[0];
  int sum=0;
  for(int num:nums){
    move=Math.max(move,num);
    sum=sum+num;
  }return move*nums.length-sum;
    }
}
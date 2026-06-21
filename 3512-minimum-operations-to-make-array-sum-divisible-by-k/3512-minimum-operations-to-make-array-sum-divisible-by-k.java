class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
                for(int ans:nums){
                    sum=(sum+ans)%k;
                }return sum;
    }
}
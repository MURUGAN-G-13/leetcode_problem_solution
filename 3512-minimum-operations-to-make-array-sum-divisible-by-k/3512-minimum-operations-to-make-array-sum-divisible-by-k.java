class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
                for(int ans:nums){
                    sum+=ans;
                }return sum%k;
    }
}
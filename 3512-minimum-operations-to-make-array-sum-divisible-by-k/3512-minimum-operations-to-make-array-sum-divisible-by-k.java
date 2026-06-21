class Solution {
    public int minOperations(int[] nums, int k) {
        // int sum=0;
        //         for(int ans:nums){
        //             sum=(sum+ans)%k;
        //         }return sum;
        int sum = Arrays.stream(nums).sum();
         return sum%k ;
    }
}
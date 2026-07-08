class Solution {
    public int subarraySum(int[] nums) {
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
     int start=i - nums[i];
     if (start<0) {
            start=0;
 }
for (int j = start; j <= i; j++) {
 sum += nums[j];
            }
        }
        return sum;
    }
}
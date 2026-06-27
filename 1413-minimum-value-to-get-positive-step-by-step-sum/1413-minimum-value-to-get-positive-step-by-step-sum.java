class Solution {
    public int minStartValue(int[] nums) {
        int startval=1;
        int sum=0;
        int start=0;
        for(int i=0;i<=nums.length-1;i++){
            sum=sum+nums[i];
            start=Math.min(start,sum);
        }return startval-(start);
    }
}
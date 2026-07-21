class Solution {
    public int minimumOperations(int[] nums) {
        int diff=0;
        int arr[]=new int[101];
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            arr[temp]++;
            if(arr[temp]==1 && temp!=0){
                diff++;
            }   
        }
        return diff;
    }
}
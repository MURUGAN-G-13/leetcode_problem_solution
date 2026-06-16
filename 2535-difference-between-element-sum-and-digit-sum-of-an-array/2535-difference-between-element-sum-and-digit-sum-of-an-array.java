class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int sd=0;
        for(int i=0;i<nums.length;i++){
              sum=sum+nums[i];
    //    if(nums[i]>9){
         while(nums[i]>0){
            sd+=nums[i]%10;
            nums[i]/=10;
        //}   
         }
    //    }else{
    //     sd=sd+nums[i];
    //    }
        }
        return sum-sd;
    }
}
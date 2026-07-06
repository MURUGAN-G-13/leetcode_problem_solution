class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int evensum=0;
            for(int i:nums){
                if((i&1)==0){
                    evensum |= i;
                }
            }return evensum;
    }
}
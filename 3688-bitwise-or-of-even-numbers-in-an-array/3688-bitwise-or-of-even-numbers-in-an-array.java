class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int evensum=0;
            for(int i:nums){
                if((i%2)==0){
                    evensum |= i;
                }
            }return evensum;
    }
}
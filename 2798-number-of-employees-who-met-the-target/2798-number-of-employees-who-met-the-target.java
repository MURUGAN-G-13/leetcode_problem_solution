class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int sum1=0;
              for(int i=0;i<hours.length;i++){
            if(hours[i]>=target){
            sum1++;
            }
        }return sum1;
    }
}
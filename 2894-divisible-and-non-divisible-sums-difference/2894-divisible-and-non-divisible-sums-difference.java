class Solution {
    public int differenceOfSums(int n, int m) {
         int num1=0;
         int num2=0;
         for(int range=0;range<=n;range++){
            if(range%m!=0){
                num1+=range;
            }else{
                num2+=range;
            }
         }return num1-num2;
    }
}
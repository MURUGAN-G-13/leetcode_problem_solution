class Solution {
    public int minimumPushes(String word) {
        int sum=0;
        int len=word.length();
        for(int i=0;i<len;i++){
            if(i<=7){
                sum+=1;
            }else if(i<=15){
                sum+=2;
            }else if(i<=23){
                sum+=3;
            }else{
                sum+=4;
            }
        }return sum;
    }
}
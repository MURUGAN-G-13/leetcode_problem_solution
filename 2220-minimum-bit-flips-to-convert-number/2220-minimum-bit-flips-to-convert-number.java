class Solution {
    public int minBitFlips(int start, int goal) {
        int step=0;
        int formula = start^goal;
        while(formula!=0){
            step=step+(formula&1);
            formula>>=1;
        }return step;
    }
}
class Solution {
    public int maxProduct(int n) {
        int m1=0, m2=0;

        for( ; n!=0;n/=10){
            int ld=n%10;
            if(ld>=m1){
                m2=m1;
                m1=ld;
            }else if(ld>m2){
                m2=ld;
            }
        }return m1*m2;
       
    }
}
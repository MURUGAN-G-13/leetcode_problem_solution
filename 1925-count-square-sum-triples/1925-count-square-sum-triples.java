class Solution {
    public int countTriples(int n) {
        int count =0;
        for(int a=1;a<n;a++){
            for(int b=1;b<n;b++){
                int csqr=(a*a)+(b*b);
                int d=(int)Math.sqrt(csqr);
                if((d*d)==csqr&&d<=n) count++;
            }
        }
        return count;
    }
}
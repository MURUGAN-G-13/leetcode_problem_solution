

class Solution {
    public int findClosest(int x, int y, int z) {
    int d1 = x > z ? x - z : z - x;
    int d2 = y > z ? y - z : z - y;
if (d1 == d2)
            return 0;
return d1 < d2 ? 1 : 2;
    }
}









    //     int min=Math.min(x, Math.min(y,z));
    //     int max=Math.max(x, Math.max(y,z));
    //    int  mid= (x+y+z)-min-max;
    //    int ans1= (mid-min);
    //    int ans2=(max-mid);
    //    return Math.abs(ans2-ans1);
       
    
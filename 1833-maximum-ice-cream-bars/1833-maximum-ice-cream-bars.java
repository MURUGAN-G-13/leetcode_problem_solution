class Solution {
    public int maxIceCream(int[] costs, int coins) {
        // int sum=0;
        // int len=costs.length;
        // for(int cost:costs){
        //     sum+=cost;
        // }
        // if(sum<=coins){
        //     return len;
        // }return 0;

        
        Arrays.sort(costs);
        int count=0;
        int buy=0;
        
        for(int i=0;i<costs.length;i++){
        buy= buy+costs[i];
          if(buy<=coins){
            count++;
          }else{
            break;
          }
        }return count;
    }
}
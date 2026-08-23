class Solution {
    public int maximumValue(String[] strs) {
        int max = 0 ;
        for(int i = 0 ; i < strs.length ; i++){
            int value = GiveValue(strs[i]);

            max = Math.max(max , value);
        }

        return max;
    }
    public int GiveValue(String s){
        if(s.matches("\\d+")){
            return Integer.parseInt(s);
        }

        return s.length();
    }
}
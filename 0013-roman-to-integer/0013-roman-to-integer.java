class Solution {
    public int val(char c){
        switch(c){
            case 'I' :return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }return 0;
    }
    public int romanToInt(String s) {
        int sum=0;
        int prev=0;
        for(int i=0;i<s.length();i++){
            int current=val(s.charAt(i));
            if(prev>=current){
                sum+=current;
            }else{
                sum-=prev;
                sum+=current-prev;
            }
            prev=current;
        }return sum;
    }
}
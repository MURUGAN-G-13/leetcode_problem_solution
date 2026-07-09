class Solution {
    public String defangIPaddr(String address) {
        String b="";
        for(int i=0;i<address.length();i++){
            char a=address.charAt(i);
            if(a=='.'){
                b+="[.]";
            }
            else{
                b+=a;
            }
        }return b;
    }
}
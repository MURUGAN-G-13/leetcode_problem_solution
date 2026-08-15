class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean negative = num < 0;
        int temp = Math.abs(num);
        String res = "";
        while (temp != 0) {
            res += temp % 7;
            temp = temp / 7;
        }
        String ans = "";
        for (int i = res.length() - 1; i >= 0; i--) {
            ans += res.charAt(i);
        }
        if (negative) {
            ans = "-" + ans;
        }
        return ans;
    }
}
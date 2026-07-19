public class Main {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.countAsterisks("l|*e*et|c**o|*de|"));
    }
}

class Solution {
    public int countAsterisks(String s) {
        int star = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '|') {
                star++;
            }

            if (c == '*' && star % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
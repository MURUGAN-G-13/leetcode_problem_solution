
class Solution {
    public int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;

        for(int range = 0; range <= n; range++) {
            if(range % m != 0) {
                num1 += range;
            } else {
                num2 += range;
            }
        }
        return num1 - num2;
    }
}












// class Solution {
//     public int differenceOfSums(int n, int m) {
//         int total = n * (n + 1) / 2;
//         int k = n / m;
//         int divisibleSum = m * k * (k + 1) / 2;
//         return total - 2 * divisibleSum;
//     }x
// }
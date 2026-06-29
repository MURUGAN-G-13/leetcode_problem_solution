class Solution {
    public int generateKey(int num1, int num2, int num3) {
    int t1 = (num1 / 1000) % 10;
    int h1 = (num1 / 100) % 10;
    int te1 = (num1 / 10) % 10;
    int o1 = num1 % 10;
    int t2 = (num2 / 1000) % 10;
    int h2 = (num2 / 100) % 10;
    int te2 = (num2 / 10) % 10;
    int o2 = num2 % 10;
    int t3 = (num3 / 1000) % 10;
    int h3 = (num3 / 100) % 10;
    int te3 = (num3 / 10) % 10;
    int o3 = num3 % 10;
return Math.min(t1, Math.min(t2, t3)) * 1000 +
               Math.min(h1, Math.min(h2, h3)) * 100 +
               Math.min(te1, Math.min(te2, te3)) * 10 +
               Math.min(o1, Math.min(o2, o3));
    }
}
class Solution {
    public int solution(int n) {
        int sum = 0;

        while (true) {
            int value = n / 10;
            int rest = n % 10;
            n = value;
            sum += rest;

            if(value == 0) {
                break;
            }
        }
        
        return sum;
    }
}
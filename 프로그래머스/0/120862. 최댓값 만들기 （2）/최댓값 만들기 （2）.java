import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        int plusVal = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        int minusVal = numbers[0] * numbers[1];

        return Math.max(plusVal, minusVal);
    }
}
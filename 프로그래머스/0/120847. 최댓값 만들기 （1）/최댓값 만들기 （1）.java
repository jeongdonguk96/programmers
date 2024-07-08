import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int[] answer = Arrays.stream(numbers)
            .sorted()
            .toArray();
        
        return answer[numbers.length - 2] * answer[numbers.length - 1];
    }
}
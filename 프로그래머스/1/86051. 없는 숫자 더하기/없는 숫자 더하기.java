import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] numbers) {
        int constant = IntStream.rangeClosed(0, 9)
            .sum();
        int sum = Arrays.stream(numbers)
                .sum();
        
        return constant - sum;
    }
}
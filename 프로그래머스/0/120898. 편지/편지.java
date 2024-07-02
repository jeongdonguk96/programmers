import java.util.stream.IntStream;

class Solution {
    public int solution(String message) {
        return IntStream.range(0, message.length())
                .map(i -> 2)
                .sum();
    }
}
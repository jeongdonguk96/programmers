import java.util.stream.*;

class Solution {
    public int solution(String num_str) {
        return IntStream.range(0, num_str.length())
                .map(i -> Integer.parseInt(String.valueOf(num_str.charAt(i))))
                .peek(System.out::println)
                .sum();
    }
}
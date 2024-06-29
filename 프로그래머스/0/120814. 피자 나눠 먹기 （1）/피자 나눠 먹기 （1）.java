import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return IntStream.of(n)
                        .map(e -> (e + 6) / 7) 
                        .findFirst()
                        .getAsInt();
    }
}
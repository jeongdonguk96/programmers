import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        answer = (int) Arrays.stream(array)
                .boxed()
                .filter(arr -> arr.equals(n))
                .count();
        return answer;
    }
}
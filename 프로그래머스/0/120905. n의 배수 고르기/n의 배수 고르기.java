import java.util.Arrays;

class Solution {
    public int[] solution(int num, int[] numList) {
        return Arrays.stream(numList)
                .filter(val -> val % num == 0)
                .toArray();
    }
}
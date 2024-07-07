import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int[] sortedSides = Arrays.stream(sides)
            .sorted()
            .toArray();
        
        return sortedSides[0] + sortedSides[1] > sortedSides[2] ? 1 : 2;
    }
}
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[Arrays.stream(arr).sum()];
        int index = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[index] = arr[i];
                index++;
            }
        }
        
        return answer;
    }
}
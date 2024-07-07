import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = 0;    
        for (int i = 0; i < num_list.length; i += n) {
            size++;
        }
        
        int[] answer = new int[size];
        int index = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (i % n == 0) {
                answer[index] = num_list[i];
                index++;
            }
        }
        
        return answer;
    }
}
import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        int index = 0;

        for (int i = my_string.length(); i >= 1; i--) {
            answer[index] = my_string.substring(i - 1);
            index++;
        }
        
        return Arrays.stream(answer).sorted().toArray(String[]::new);
    }
}
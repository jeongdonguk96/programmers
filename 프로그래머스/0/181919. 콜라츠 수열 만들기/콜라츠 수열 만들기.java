import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        int count = 0;
        answer.add(n);

        while (true) {
            int i = 0;
            if (count == 0) {
                i = n % 2 == 0 ? n / 2 : n * 3 + 1;
            }
            if (count > 0) {
                i = answer.get(count);
                i = i % 2 == 0 ? i / 2 : i * 3 + 1;
            }
            answer.add(i);
            count++;
            
            if (i == 1) {
                break;
            }
        }
        
        return answer.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
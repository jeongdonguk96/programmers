import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();

        int lastBeforeOne = num_list[num_list.length - 2];
        int lastOne = num_list[num_list.length - 1];

        Arrays.stream(num_list)
                .forEach(
                        answer::add
                );

        if (lastOne > lastBeforeOne) {
            answer.add(lastOne - lastBeforeOne);
        } else {
            answer.add(lastOne * 2);
        }

        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();

    }
}
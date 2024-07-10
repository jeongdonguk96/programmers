import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {        
        List<Integer> arr1 = new ArrayList<>();
        Set<Integer> delete_list1 = new HashSet<>();
        
        for (int num : arr) {
            arr1.add(num);
        }
        for (int num : delete_list) {
            delete_list1.add(num);
        }
        
        return arr1.stream()
            .filter(i -> !delete_list1.contains(i))
            .mapToInt(Integer::intValue)
            .toArray();
    }
}
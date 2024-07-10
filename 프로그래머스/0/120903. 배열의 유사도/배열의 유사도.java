import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] s1, String[] s2) {
        Set<String> s1Set  = Arrays.stream(s1).collect(Collectors.toSet());
        Set<String> s2Set  = Arrays.stream(s2).collect(Collectors.toSet());
        
        return (int) s1Set.stream()
            .filter(str -> s2Set.contains(str))
            .count();
    }
}
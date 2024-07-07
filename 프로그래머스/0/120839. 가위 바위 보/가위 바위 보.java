import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String rsp) {
        return Arrays.stream(rsp.split(""))
            .map(str -> str.equals("2") ? "0" : (str.equals("0") ? "5" : "2"))
            .collect(Collectors.joining());
    }
}
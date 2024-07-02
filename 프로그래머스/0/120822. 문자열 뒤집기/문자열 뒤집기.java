import java.util.stream.*;

class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        int length = my_string.length();
        
        for (int i = 0; i < my_string.length(); i++ ) {
            length--;
            sb.append(my_string.charAt(length));
        }
        
        return sb.toString();
    }
}
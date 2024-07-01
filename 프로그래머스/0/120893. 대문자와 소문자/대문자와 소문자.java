class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            char charAt = my_string.charAt(i);
            if (charAt >= 97) {
                sb.append(Character.toUpperCase(charAt));
            } else {
                sb.append(Character.toLowerCase(charAt));
            }
        }
        
        return sb.toString();
    }
}
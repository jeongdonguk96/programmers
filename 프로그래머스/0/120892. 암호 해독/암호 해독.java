class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cipher.length(); i++) {
            if ((i + 1) % code == 0) {
                char c = cipher.charAt(i);
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
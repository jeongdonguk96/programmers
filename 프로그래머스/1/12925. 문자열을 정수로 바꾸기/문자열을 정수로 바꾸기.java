class Solution {
    public int solution(String s) {
        return s.startsWith("-") ? Integer.valueOf(s) : Integer.valueOf(s);
    }
}
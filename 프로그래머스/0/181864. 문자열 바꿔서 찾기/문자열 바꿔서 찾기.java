class Solution {
    public int solution(String myString, String pat) {
        StringBuilder transformedString = new StringBuilder();

        for (char c : myString.toCharArray()) {
            if (c == 'A') {
                transformedString.append('B');
            } else if (c == 'B') {
                transformedString.append('A');
            }
        }

        return transformedString.toString().contains(pat) ? 1 : 0;
    }
}
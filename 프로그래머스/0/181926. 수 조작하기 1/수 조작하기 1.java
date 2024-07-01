class Solution {
    public int solution(int n, String control) {
        for (int i = 0; i < control.length(); i++) {
            String target = String.valueOf(control.charAt(i));
            n += switch (target) {
                case "w" -> + 1;
                case "s" -> - 1;
                case "d" -> + 10;
                case "a" -> - 10;
                default -> + 0;
            };
        }
        
        return n;
    }
}
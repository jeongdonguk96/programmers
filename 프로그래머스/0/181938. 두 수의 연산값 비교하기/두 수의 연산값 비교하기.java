class Solution {
    public int solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(a));
        sb.append(String.valueOf(b));
        
        int plus = Integer.parseInt(sb.toString());          
        int multiply = 2 * a * b;
                  
        return plus >= multiply ? plus : multiply;
    }
}
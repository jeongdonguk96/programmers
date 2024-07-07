class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            int askii = (int) c;
            
            if (askii < 108) {
                c = 'l';
            }
        
            sb.append(c);
        }
        
        return sb.toString();
    }
}
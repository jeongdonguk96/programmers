class Solution {
    public int[] solution(String myString) {
        String[] strings = myString.split("x");
        int[] answer;

        if (myString.endsWith("x")) {
            answer = new int[strings.length + 1];
        } else {
            answer = new int[strings.length];
        } 

        for (int i = 0; i < strings.length; i++) {
            answer[i] = strings[i].length();
            if (strings[strings.length-1].equals("x")) {
                answer[i + 1] = 0;
            }
        }
        
        return answer;
    }
}
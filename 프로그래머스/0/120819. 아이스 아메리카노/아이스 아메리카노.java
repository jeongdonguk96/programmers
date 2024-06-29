class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int count = 0;
        int rest = money;
        
        while(rest >= 5500) {
            count++;
            rest -= 5500;
        }
        
        answer[0] = count;
        answer[1] = rest;
        
        return answer;
    }
}
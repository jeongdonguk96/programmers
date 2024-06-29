class Solution {
    public int solution(int price) {
        if (price >= 500000) {
            price -= price * 0.20;
        } else if (price >= 300000) {
            price -= price * 0.10;
        } else if (price >= 100000) {
            price -= price * 0.05;
        }
        
        return price;
    }
}
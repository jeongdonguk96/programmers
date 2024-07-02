class Solution {
    public int solution(int n, int k) {
        int dish = 12000;
        int drink = 2000;
        int disscountedDrink = n / 10;
        
        int dishAmount = n * dish;
        int drinkAmount = (k * drink)  - (disscountedDrink * 2000);
                
        return dishAmount + drinkAmount;
    }
}
class Solution {
    public int solution(int[] num_list) {
        int multiply = 1;
        int tempSquare = 0;

        for (int i : num_list) {
            multiply *= i;
        }

        for (int i : num_list) {
            tempSquare += i;
        }
        int square = tempSquare * tempSquare;

        if (multiply > square) {
            return 0;
        } else {
            return 1;
        } 
        
    }
}
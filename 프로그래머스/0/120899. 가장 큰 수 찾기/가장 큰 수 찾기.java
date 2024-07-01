class Solution {
    public int[] solution(int[] array) {
        int value = 0;
        int index = 0;
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                value = array[i];
                index = i;
            }
        }
        
        return new int[]{value, index};
    }
}
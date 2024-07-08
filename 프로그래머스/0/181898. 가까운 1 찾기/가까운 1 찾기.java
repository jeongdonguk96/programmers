import java.util.Arrays;

class Solution {
    public int solution(int[] arr, int idx) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i >= idx && arr[i] == 1) {
                index = i;
                return index;
            }
        }
        
        return -1;
    }
}
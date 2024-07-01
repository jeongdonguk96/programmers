class Solution {
    public int solution(int[] num_list) {
        StringBuilder oddSb = new StringBuilder();
        StringBuilder evenSb = new StringBuilder();

        for (int i : num_list) {
            if (i % 2 != 0) {
                oddSb.append(i);
            } else {
                evenSb.append(i);
            }
        }
        
        int odd = Integer.parseInt(oddSb.toString());
        int even = Integer.parseInt(evenSb.toString());
        
        return odd + even;
    }
}
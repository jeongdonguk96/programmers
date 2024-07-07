class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < rsp.length(); i++) {
            String str = "2".equals(String.valueOf(rsp.charAt(i))) ? "0" : ("0".equals(String.valueOf(rsp.charAt(i))) ? "5" : "2");
            sb.append(str);
        }

        return sb.toString();
    }
}
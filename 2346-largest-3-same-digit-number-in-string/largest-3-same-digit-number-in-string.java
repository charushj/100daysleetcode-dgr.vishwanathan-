 class Solution {
    public String largestGoodInteger(String num) {
        Integer max = 999;

        while(max > 0) {
            if(num.contains(Integer.toString(max))) {
                return Integer.toString(max);
            }

            max -= 111;
        }

        if(num.contains("000"))return "000";

        return "";
    }
}
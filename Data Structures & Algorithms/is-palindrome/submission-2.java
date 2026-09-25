class Solution {
    public static boolean isAlphaNumeric(String str) {
        return str.matches("[a-zA-Z0-9]+");
    }
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\s", "");
        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;
        while (left != right && left < s.length() && right >= 0){
            if (!isAlphaNumeric(String.valueOf(s.charAt(left)))){
                left++;
                continue;
            }
            if (!isAlphaNumeric(String.valueOf(s.charAt(right)))){
                right--;
                continue;
            }
            
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int leftWindow = 0;
        int rightWindow = 0;
        HashSet<Character> chars = new HashSet<Character>();
        int windowSize = 0;
        while (rightWindow < s.length()){
            char current = s.charAt(rightWindow);
            while (chars.contains(current)){
                chars.remove(s.charAt(leftWindow));
                leftWindow++;
            }
            chars.add(current);
            windowSize = Math.max(windowSize, rightWindow - leftWindow + 1);
            rightWindow++;
        }
        return windowSize;
    }
}

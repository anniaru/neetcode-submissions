class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){ return false;
        }
        HashMap<Character, Integer> lettersS = new HashMap<>();
        HashMap<Character, Integer> lettersT = new HashMap<>();

        // store letters of s in hashmap
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (lettersS.containsKey(c)){
                lettersS.replace(c, lettersS.get(c)+1);
            }
            else {
                lettersS.put(c,1);
            }
        }

        // store letters of t in hashmap
        for (int j = 0; j < t.length(); j++) {
            Character c = t.charAt(j);
            if (lettersT.containsKey(c)){
                lettersT.replace(c, lettersT.get(c)+1);
            }
            else {
                lettersT.put(c,1);
            }
        }


        //iterate through hashmap
        for (Character i: lettersS.keySet()){
            if (!lettersS.get(i).equals(lettersT.get(i))){
                return false;
            }
        }

        return true;
    }
}

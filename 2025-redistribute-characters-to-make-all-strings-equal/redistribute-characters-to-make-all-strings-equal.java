class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Count the occurrences of each character
        for (String word : words) {
            for (char c : word.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        int n = words.length;

        // Check if each character's count is a multiple of the number of strings
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() % n != 0) {
                return false;
            }
        }

        return true;
    }

}
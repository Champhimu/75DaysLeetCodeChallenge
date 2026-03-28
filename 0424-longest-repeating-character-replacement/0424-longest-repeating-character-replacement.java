class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26]; // frequency of characters
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // update frequency
            count[s.charAt(right) - 'A']++;
            
            // track max frequency in current window
            maxFreq = Math.max(maxFreq, count[s.charAt(right) - 'A']);

            // if window is invalid, shrink it
            while ((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            // update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
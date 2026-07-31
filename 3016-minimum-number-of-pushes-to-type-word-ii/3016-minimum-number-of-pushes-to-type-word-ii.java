import java.util.Arrays;

class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];

        // Count frequency of each character
        for (int i = 0; i < word.length(); i++) {
            freq[word.charAt(i) - 'a']++;
        }

        // Sort frequencies in ascending order
        Arrays.sort(freq);

        int ans = 0;
        int push = 1;
        int count = 0;

        // Traverse from highest frequency to lowest
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) {
                break;
            }

            ans += freq[i] * push;
            count++;

            // After every 8 letters, increase the push count
            if (count % 8 == 0) {
                push++;
            }
        }

        return ans;
    }
}

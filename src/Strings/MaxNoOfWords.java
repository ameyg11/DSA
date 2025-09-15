package Strings;

public class MaxNoOfWords {

    public static void main(String[] args) {
        Solution obj = new Solution();
        int ans = obj.canBeTypedWords("leet code", "d");
        System.out.print(ans);

    }
}

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count = 0;

        // loop over words with index
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean canType = true;

            // loop over broken letters
            for (int j = 0; j < brokenLetters.length(); j++) {
                char c = brokenLetters.charAt(j);
                if (word.indexOf(c) != -1) { // word contains broken letter
                    canType = false;
                    break;
                }
            }

            if (canType) {
                count++;
            }
        }

        return count;
    }
}


class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s;
        
        int start = 0;
        int maxlength = 1;
        boolean[][] d = new boolean[s.length()][s.length()];


        for (int i = 0; i < s.length(); i++) {
            d[i][i] = true;
        }


        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                d[i][i + 1] = true;
                start = i;
                maxlength = 2;
            }
        }

 
        for (int l = 3; l <= s.length(); l++) {
            for (int i = 0; i + l - 1 < s.length(); i++) {
                int j = i + l - 1;
                if (s.charAt(i) == s.charAt(j) && d[i + 1][j - 1]) {
                    d[i][j] = true;
                    start = i;
                    maxlength = l;
                }
            }
        }
        return s.substring(start, start + maxlength);
    }
}

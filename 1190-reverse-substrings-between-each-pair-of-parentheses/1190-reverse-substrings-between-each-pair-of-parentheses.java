class Solution {

    int index = 0;

    public String reverse(String s) {
        String ans = "";

        while (index < s.length()) {

            char ch = s.charAt(index);

            if (ch == '(') {
                index++;
                ans += reverse(s);
            }
            else if (ch == ')') {
                index++;

                // Reverse this complete pair
                String rev = "";
                for (int i = ans.length() - 1; i >= 0; i--) {
                    rev += ans.charAt(i);
                }

                return rev;
            }
            else {
                ans += ch;
                index++;
            }
        }

        return ans;
    }

    public String reverseParentheses(String s) {
        index = 0;
        return reverse(s);
    }
}
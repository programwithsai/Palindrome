public class Palindrome {
    /**
     *
     * @param s - Check if this string is a Palindrome
     * @return true if input string is a Palindrome, false if not
     * Note: Case insensitive algorithm.
     */
    public boolean isPalindrome(String s) {

        var input = s.toLowerCase();
        for (int i = 0, j = input.length() - 1; i < j; i++, j--) {
            if (input.charAt(i) != input.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
package strings;
public class PalindromeTestWithCharArray {
	//@ ensures \result == true <==> (\forall int iter; 0 <= iter && iter < s.length; s[iter] == s[s.length-iter-1]);
	//@ signals (Exception e) false;
	public static boolean checkPalindrome(char[] s) {
		for (int i = 0; i < s.length/2; i++) {
			if (s[i] != s[s.length-i-1]) {
				return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {
	}
}
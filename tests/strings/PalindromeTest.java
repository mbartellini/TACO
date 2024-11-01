package strings;
public class PalindromeTest {
	//@ ensures \result == true <==> (\forall int i; 0 <= i && i < s.length(); s.charAt(i) == s.charAt(s.length()-i-1));
	//@ signals (Exception e) false;
	public static boolean checkPalindrome(String s) {
		for (int i = 0; i < s.length()/2; i++) {
			if (s.charAt(i) != s.charAt(s.length()-i-1)) {
				return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {
	}
}
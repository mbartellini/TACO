package strings;
public class PalindromeTest {
	//@ ensures \result == true <==> (\forall int iter; 0 <= iter && iter < s.length(); s.charAt(iter) == s.charAt(s.length()-iter-1));
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
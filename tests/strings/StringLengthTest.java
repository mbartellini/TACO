package strings;
public class StringLengthTest {
	//@ ensures \result == true <==> (\old(s.length()) == 1);
	public static boolean check(String s) {
		return s.length() == 1;
	}

}
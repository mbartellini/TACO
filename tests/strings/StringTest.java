package strings;
public class StringTest {
	//@ ensures \result == true <==> (\old(i) == 0);
	public static boolean check(String s, int i) {
		if (s == null)
			return true;
		return i == 0;
	}

}
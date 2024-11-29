package strings;
public class NullStringTest {
	//@ ensures \result == true <==> (s == null);
	public static boolean checkNull(String s) {
		return s == null;
	}

}
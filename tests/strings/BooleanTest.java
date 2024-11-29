package strings;
public class BooleanTest {
	//@ ensures \result == true <==> (\old(b) != null);
	public static boolean checkNull(Boolean b) {
		return b != null;
	}

}
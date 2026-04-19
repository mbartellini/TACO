package strings;

public class StringTest {
    //@ requires true;
    //@ ensures \result == true <==> (\forall int i; 0 <= i && i < s.length(); s.charAt(i) == s.charAt(s.length() - i));
    public boolean returnTrue(String s) {
        if (s.length() == 5) {
            return true;
        } else {
            return false;
        }
    }

}

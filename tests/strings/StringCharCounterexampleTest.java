package strings;

public class StringCharCounterexampleTest {
    //@ requires true;
    //@ ensures \result == true;
    public boolean returnTrue(String s) {
        if (s.length() > 0 && s.charAt(0) == 'a') {
            return false;
        } else {
            return true;
        }
    }

}

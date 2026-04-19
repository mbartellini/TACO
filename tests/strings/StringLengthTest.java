package strings;

public class StringLengthTest {
    //@ requires true;
    //@ ensures \result == true <==> s.length() == 5;
    public boolean returnTrue(String s) {
        if (s.length() == 5) {
            return true;
        } else {
            return false;
        }
    }

}

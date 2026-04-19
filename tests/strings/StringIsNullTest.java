package strings;

public class StringIsNullTest {
    //@ requires true;
    //@ ensures \result == true <==> \old(s) == null;
    public boolean isNull(String s) {
        if (s == null) {
            return true;
        } else {
            return false;
        }
    }

}

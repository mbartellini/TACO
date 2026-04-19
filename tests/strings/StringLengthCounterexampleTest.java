package strings;

public class StringLengthCounterexampleTest {
    //@ requires true;
    //@ ensures \result == true;
    public boolean returnTrue(String s) {
        if (s.length() == 2) {
            return false;
        } else {
            return true;
        }
    }

}

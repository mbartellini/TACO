package strings;

public class IntTest {
    //@ requires true;
    //@ ensures \result >= 0 && (\result == num || \result == -num);
    public int absolute(int num) {
        if (num < 0) {
            return -num;
        } else {
            return num;
        }
    }

    public static void main(String[] args){
        IntTest a = new IntTest();
        int num = -2147483648;
        System.out.println(a.absolute(num));
    }

}

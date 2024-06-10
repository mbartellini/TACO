package forArielGodio.fibonacci.bug01;

//@ model import org.jmlspecs.lang.*;
//@ model import org.jmlspecs.lang.*;


public class Fibonacci extends java.lang.Object {

  private /*@ spec_public @*/ long[] forArielGodio_fibonacci_bug01_Fibonacci_fib;
  /*@ invariant 2  <=  this.forArielGodio_fibonacci_bug01_Fibonacci_fib.length && this.forArielGodio_fibonacci_bug01_Fibonacci_fib.length  <=  93;
    @*/

  /*@ 
    @ requires ((long)this.forArielGodio_fibonacci_bug01_Fibonacci_fib[0])  ==  0L && ((long)this.forArielGodio_fibonacci_bug01_Fibonacci_fib[1])  ==  1L;
    @ ensures (\forall int i; 2  <=  i && i  <  this.forArielGodio_fibonacci_bug01_Fibonacci_fib.length; ((long)this.forArielGodio_fibonacci_bug01_Fibonacci_fib[i])  ==  ((long)this.forArielGodio_fibonacci_bug01_Fibonacci_fib[i - 1]) + ((long)this.forArielGodio_fibonacci_bug01_Fibonacci_fib[i - 2]));
    @ ensures (\forall int i; 2  <=  i && i  <  this.forArielGodio_fibonacci_bug01_Fibonacci_fib.length; (\forall int j; 2  <=  j && j  <  i; ((long)this.forArielGodio_fibonacci_bug01_Fibonacci_fib[j])  <  ((long)this.forArielGodio_fibonacci_bug01_Fibonacci_fib[i])));
    @ signals (java.lang.Exception e) false;
    @*/
  public void fibCompute() {
    {
      {
        int var_1_index = 2;

        {
          boolean t_31;
          boolean t_32;
          boolean t_33;

          t_31 = var_1_index  <  this.forArielGodio_fibonacci_bug01_Fibonacci_fib.length;
          {
            assert t_31;
            {
              {
                {
                  {
                    {
                      {
                        boolean t_30;

                        {
                          int t_8;
                          long t_9;
                          int t_10;
                          long t_11;
                          int t_12;

                          t_8 = var_1_index - 2;
                          t_9 = this.forArielGodio_fibonacci_bug01_Fibonacci_fib[t_8];
                          t_10 = var_1_index + 1;
                          t_11 = this.forArielGodio_fibonacci_bug01_Fibonacci_fib[t_10];
                          this.forArielGodio_fibonacci_bug01_Fibonacci_fib[var_1_index] = t_9 + t_11;
                          t_12 = var_1_index;
                          var_1_index = var_1_index + 1;
                        }
                        t_30 = var_1_index  <  this.forArielGodio_fibonacci_bug01_Fibonacci_fib.length;
                        {
                          assert ! t_30;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          t_32 = var_1_index  <  this.forArielGodio_fibonacci_bug01_Fibonacci_fib.length;
          t_33 = ! t_32;
          assert t_33;
        }
      }
    }
  }

}

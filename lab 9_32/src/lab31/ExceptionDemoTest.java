package lab31;

import org.junit.Test;
import lab18.ExceptionDemo;

public class ExceptionDemoTest {

    @Test(expected = ArithmeticException.class)
    public void run() {
        ExceptionDemo exceptionDemo = new ExceptionDemo();
        exceptionDemo.run();
    }

    @Test
    public void check() {
        ExceptionDemo exceptionDemo = new ExceptionDemo();
        exceptionDemo.check();
    }
}
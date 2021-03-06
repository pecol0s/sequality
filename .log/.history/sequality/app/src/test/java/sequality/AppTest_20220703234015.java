/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
  @Test
  public void testAppReternHelloWorld() {
    FizzbuzzCounter classUnderTest = new FizzbuzzCounter();
    String e1 = "Fizz: 2, Buzz: 1, FizzBuzz: 0";
    String e2 = "Fizz: 3, Buzz: 2, FizzBuzz: 0";
    String e3 = "Fizz: 8, Buzz: 4, FizzBuzz: 2";
    String e4 = "Fizz: 0, Buzz: 0, FizzBuzz: 0";

    assertEquals(e1, classUnderTest.FbCounter(6));
    assertEquals(e2, classUnderTest.FbCounter(10));
    assertEquals(e3, classUnderTest.FbCounter(30));
    assertEquals(e4, classUnderTest.FbCounter(1));
  }
}

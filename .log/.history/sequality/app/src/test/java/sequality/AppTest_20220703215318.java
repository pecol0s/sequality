/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
  @Test
  public void testAppReternHelloWorld() {
    App classUnderTest = new App();
    assertEquals("Hello World!", classUnderTest.getGreeting());
    assertEquals("Sum of 2 and 3 is 5. Average is 2.5.", classUnderTest.sum1());
    assertEquals("Sum of 1 to 10 is 55. Average is 5.5.", classUnderTest.sum2());
    assertEquals("Hello World!", classUnderTest.sum3());
  }
}
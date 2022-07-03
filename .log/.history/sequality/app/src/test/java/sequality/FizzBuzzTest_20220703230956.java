package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzbuzzTest {
  @Test
  public void testFbCounter() {
    FizzbuzzCounter fizzbuzzcounter = new FizzbuzzCounter();
    String e1 = "Fizz: 2, Buzz: 2, FizzBuzz: 0";
    String e2 = "Fizz: 2, Buzz: 2, FizzBuzz: 0";
    String e3 = "Fizz: 2, Buzz: 2, FizzBuzz: 0";
    String e4 = "Fizz: 2, Buzz: 2, FizzBuzz: 0";

    assertEquals(e1, fizzbuzzcounter.FbCounter(6));
    assertEquals(e2, fizzbuzzcounter.FbCounter(10));
    assertEquals(e3, fizzbuzzcounter.FbCounter(30));
    assertEquals(e4, fizzbuzzcounter.FbCounter(8));
  }
}

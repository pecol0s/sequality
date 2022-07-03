package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzbuzzTest {
  @Test
  public void testFbCounter() {
    FizzbuzzCounter fizzbuzzcounter = new FizzbuzzCounter();
    int e1 = "Fizz: 2, Buzz: 
    int e2 = "Fizz: " + f_str + ", Buzz: " + b_str + ", FizzBuzz: " + fb_str
    int e3 = "Fizz: " + f_str + ", Buzz: " + b_str + ", FizzBuzz: " + fb_str
    int e4 = "Fizz: " + f_str + ", Buzz: " + b_str + ", FizzBuzz: " + fb_str

    assertEquals(e1, fizzbuzzcounter.FbCounter(6));
    assertEquals(e2, fizzbuzzcounter.FbCounter(10));
    assertEquals(e3, fizzbuzzcounter.FbCounter(30));
    assertEquals(e4, fizzbuzzcounter.FbCounter(8));
  }
}

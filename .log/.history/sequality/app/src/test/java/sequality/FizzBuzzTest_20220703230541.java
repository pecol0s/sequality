package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzbuzzTest {
  @Test
  public void testFbCounter() {
    FizzbuzzCounter fizzbuzzcounter = new FizzbuzzCounter();
    int e1 = 6;
    int e2 = 10;
    int e3 = 30;
    int e4 = 8;

    assertEquals(e1, FizzBuzzCounter.FbCounter(6));
    assertEquals(e2, FizzBuzzCounter.FbCounter(6));
    assertEquals(e3, FizzBuzzCounter.FbCounter(6));
    assertEquals(e4, FizzBuzzCounter.FbCounter(6));
  }
}

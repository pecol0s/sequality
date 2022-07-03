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

    assertEquals(e1, fizzbuzzcounter.FbCounter(6));
    assertEquals(e2, fizzbuzzcounter.FbCounter(6));
    assertEquals(e3, fizzbuzzcounter.FbCounter(6));
    assertEquals(e4, fizzbuzzcounter.FbCounter(6));
  }
}

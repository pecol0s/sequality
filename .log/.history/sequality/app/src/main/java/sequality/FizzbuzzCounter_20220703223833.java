package sequality;

public class FizzbuzzCounter {
  public String FbCounter(int x) {
    int f = 0;
    int b = 0;
    int fb = 0;
    String f_str = "";
    String b_str = "";
    String fb_str = "";

    for (int i = 1; i < x; i++) {
      if (i % 15 == 0) {
        fb = fb + 1;
      } else if (i % 3 == 0) {
        f = f + 1;
      } else if (i % 5 == 0) {
        b = b + 1;
      } else {
        continue;
      }
    }
  }
}

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public String sum1() {
    int s = new Calculate().sum(2, 3);
    int ave = s / 10;
    return "Sum of 2 and 3 is " + s + ". Average is " + ave + ".";
  }

  public String sum2() {
    int s = 0;
    int ave = 0;
    for (int i = 1; i <= 10; i++) {
      s = new Calculate().sum(s, i);
    }
    ave = s / 10;
    return "Sum of 1 to 10 is " + s + ". Average is " + ave + ".";
  }
  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    for (int i = 1; i <= 10; i++) {
      if (i % 2 == 0) {
        even = new Calculate().sum(even, i);
      } else {
        odd = new Calculate().sum(odd, i);
      }
    }
    System.out.println("Sum of odd of 1 to 10 is " + odd + ". Sum of even is " + even + ".");
  }
}

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    int odd = 0;
    int even = 0;
    int s = new Calculate().sum(2, 3);
    int ave = s / 10;
    System.out.println("Sum of 2 and 3 is " + s + ". Average is " + ave + ".");

    s = 0;
    ave = 0;
    for (int i = 1; i <= 10; i++) {
      s = new Calculate().sum(s, i);
    }
    ave = s / 10;
    System.out.println("Sum of 1 to 10 is " + s + ". Average is " + ave + ".");

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

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
    int s = new Calculate().sum(2, 3);
    int ave = s / 10;
    System.out.println("Sum of 2 and 3 is " + s + ". Average is " + ave + ".");

    s = 0;
    ave = 0;
    for (int i = 1; i <= 10; i++) {
      
    }
  }
}

import java.io.Console;

public class NounAdj {
  public static void main(String[] args) {
    Console rake = System.console();

    System.out.println("Hi");
    System.out.println("What's your mother's name?");
    String hag = rake.readLine();
    System.out.println("Did you just say " + hag + "?");
    System.out.println("Where are you from?");
    String loc = rake.readLine();
    System.out.println("Far out man...");
    System.out.println("I once nailed a wild chick from " + loc + " and her name was definitely " + hag + "!");

  }
}

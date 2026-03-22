package collectionnnnn;

public class GFG {
  public static void main(String[] args) {
    Runnable r = () -> System.out.println("Running in Runnable thread");
    r.run();

    System.out.println("Running in main thread ");
  }
}

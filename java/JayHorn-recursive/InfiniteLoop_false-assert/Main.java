import java.util.Random;

public class Main {
  public static void main(String[] arg) {
    int i = 0;
    boolean b = new Random().nextBoolean();

    while(true) {
      i++;
      assert(b);
    }
  }
}

class A {}

class B {}

public class Main {
  public static void main(String[] args) {
      try {
          Object a = new A();
          B b = (B)a;
      }
      catch (Exception exc) {
          assert false;
      }
  }
}

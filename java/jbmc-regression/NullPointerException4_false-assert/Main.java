class A {
    int i;
}

public class Main {
    public static void main(String[] args) {
        A a=null;
        try {
            a.i=0;
        }
        catch (Exception exc) {
            assert false;
        }
    }
}

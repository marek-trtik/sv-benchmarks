interface A
{
  public void f();
};

class B implements A
{
  public void f()
  {
    assert false;
  }
};

class C implements A
{
  public void f(){ }
};

class Main
{
  public static void main(String[] args)
  {
    A b = new B();
    A c = new C();
    c.f();
  }
}


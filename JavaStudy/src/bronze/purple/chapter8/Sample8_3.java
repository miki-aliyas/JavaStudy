package bronze.purple.chapter8;

interface Myinterface {
    int b = 10;
    final int c = 20;
    public int d = 30;
    static int e = 40;
    public final int f = 50;

    public abstract void methodA();
    abstract void methodB();
    void methodC();
}
class MyClass implements Myinterface {
    public void methodA() {}
    public void methodB() {}
    public void methodC() {}
}

public class Sample8_3 {
}

package bronze.purple.chapter8;

abstract class Super {
    protected abstract void methodA();
    public void methodB() {}
}
class Sub extends Super {
    protected void methodA(){}
    public void methodB(){}
}
public class Sample8_1 {
}
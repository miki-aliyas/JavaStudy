package bronze.purple.chapter8;

abstract class Foo {
    int x; int y;
    public abstract void print();
    public void method(int x, int y) { this.x = x; this.y = y; }
}
class MyClass2 extends Foo {
    public void print() {
        System.out.println("x : " + x + "y : " + y);
    }
}
public class Sample8_6 {
    public static void main(String[] args) {
        Foo f = new MyClass2();
        f.method(10, 20);
        f.print();
    }
}

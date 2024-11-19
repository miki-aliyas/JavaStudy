package bronze.purple.chapter7;

class Super2 {
    public Super2() { System.out.println("Super2()"); }
    public Super2(int a) { System.out.println("Super2(int a)"); }
}
class Sub2 extends Super2 {
    public Sub2() { System.out.println("Sub2()"); }
    public Sub2(int a) { System.out.println("Sub2(int a)"); }
}
public class Sample7_6 {
    public static void main(String[] args) {
        Sub2 s1 = new Sub2();
        Sub2 s2 = new Sub2(10);
    }
}

package bronze.purple.chapter7;
class Super3 {
    public Super3() { System.out.println("Super3()"); }
    public Super3(int a) { System.out.println("Super3(int a)"); }
}
class Sub3 extends Super3 {
    public Sub3() { System.out.println("Sub3()"); }
    public Sub3(int a) {
        super(a);
        System.out.println("Sub3(int a)"); }
}
public class Sample7_7 {
    public static void main(String[] args) {
        Sub3 s1 = new Sub3();
        Sub3 s2 = new Sub3(10);
    }
}
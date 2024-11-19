package bronze.purple.chapter7;

class Super1 {
    int num;
    public void methodA() { num += 100; }
    public void print() {System.out.println("num 値 :" + num); }
}
class Sub1 extends Super1 {
    public void methodA() {num += 500; }
    public void methodB() {
        methodA();
        print();
        super.methodA();
        print();
    }
}
public class Sample7_5 {
    public static void main(String[] args) {
        Sub1 s = new Sub1();
        s.methodB();
    }
}
package bronze.purple.chapter6;

class Test {
    void myPrint(){ System.out.println("myPrint()"); }
    void myPrint(int a) { System.out.println("myPrint(int a)"); }
    void myPrint(int a, int b) { System.out.println("MyPrint(inta, innt b)"); }
    void myPrint(String  s) { System.out.println("myPrint(String s)"); }
}
public class Sample6_3 {
    public static void main(String[] args) {
        Test t = new Test();
        t.myPrint();
        t.myPrint(100);
        t.myPrint(100,200);
        t.myPrint("yamamoto");
    }
}

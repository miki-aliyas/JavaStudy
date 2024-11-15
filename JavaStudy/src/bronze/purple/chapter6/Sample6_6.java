package bronze.purple.chapter6;

class Test3 {
    int instanceVal = 100;
    static int staticVal = 200;
    void methodA() { System.out.println("methodA(): " + instanceVal);}
    static void methodB() { System.out.println("methodB(): " + staticVal);}
}
public class Sample6_6 {
    public static void main(String[] args) {
//        System.out.println(Test3.instanceVal);
        System.out.println(Test3.staticVal);
//        Test.methodA();
        Test3.methodB();
        System.out.println("--------------");
        Test3 t  = new Test3();
        System.out.println(t.instanceVal);
        System.out.println(t.staticVal);
        t.methodA();
        t.methodB();
    }
}

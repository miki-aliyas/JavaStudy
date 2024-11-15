package bronze.purple.chapter6;

class Test2 {
    String myPrint(int a, String b) { return "test"; }
    String myPrint(int a, int b) { return "test"; }
    String myPrint(String a, int b) {return "test"; }
//    void myPrint(int a, String b) {}
//    String myPrint (int x, String y) {return "test"; }
}
public class Sample6_4 {
    public static void main(String[] args) {
        Test t = new Test();
        t.myPrint();
        t.myPrint(100);
        t.myPrint(100, 200);
        t.myPrint("yamamoto");
    }
}

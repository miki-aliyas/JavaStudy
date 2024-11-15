package bronze.purple.chapter6;

class Employee3 {
    private int id;
    public Employee3(int i) { id = i; }
    public int getId() { return id; }
}
public class Sample6_8 {
    public static void main(String[] args) {
        Employee3 emp = new Employee3(100);
//        "private"指定されたメンバは、他のクラスからアクセス不可
//        System.out.println("private指定のメソッドへのアクセス :　" + emp.id());
//        "private"指定されたメンバは、他のクラスからアクセス可
        System.out.println("public指定のメソッドへのアクセス :　" + emp.getId());
    }
}

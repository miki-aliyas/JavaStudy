package bronze.purple.chapter6;

public class Sample6_2 {
    public static void main(String[] args) {

        Employee a = new Employee(1, "");

        a.setId(100);

        Employee b = new Employee(2);

        b.setId(200);

        System.out.println("Aさん：" + a.getId());
        System.out.println("Bさん：" + b.getId());
    }
}

class Employee {
    public Employee(int id){
        this.id = id;
    }

    public Employee(int id, String name) {

    }

    int id;
    void setId(int i) {
        id = i;
    }
    int getId() {
        return id;
    }
}
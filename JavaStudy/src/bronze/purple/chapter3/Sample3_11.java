package bronze.purple.chapter3;

public class Sample3_11 {
    public static void main(String[] args) {
        int a =10;
        if (a > 0) {
            System.out.println("aの値は正の値です。");
            if (a % 2 == 0) {
                System.out.println("aは偶数です。");
            }
        } else {
            if (a == 0) {
                System.out.println("aは0です。");
            } else {
                System.out.println("aは負の値です。");
            }
        }
    }
}

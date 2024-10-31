package bronze.purple.chapter4;

public class Sample4_11 {
    public static void main(String[] args) {
        for (int i = 1; i < 10 ; i++) {
            if ((i % 3) == 0) {
                System.out.println("処理をスキップします");
//                continueによりfor文の式３へ制御を移す
                continue;
            }
            System.out.println("i = " + i);
        }
        System.out.println("for文の後の処理");
    }
}

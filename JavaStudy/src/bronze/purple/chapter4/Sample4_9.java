package bronze.purple.chapter4;

public class Sample4_9 {
    public static void main(String[] args) {
//        式２が省略されているので無限ループ
        for (int i = 0;  ; i++) {
            if (i == 3) {
//                breakによりfor文から抜ける
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.println("for文の後の処理");
    }
}

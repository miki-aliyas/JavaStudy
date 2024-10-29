package bronze.purple.chapter4;

public class Sample4_6 {
    public static void main(String[] args) {
        int count1 = 0;
//        式1を省略
        for (; count1 < 5 ; count1++) {
         System.out.print(count1);
        }
//        改行
        System.out.println();
//        式3を省略
        for (int count2 = 0 ; count2 < 5 ;) {
//            処理文内でカウンタ変数の更新
            System.out.print(count2++);
        }
    }
}

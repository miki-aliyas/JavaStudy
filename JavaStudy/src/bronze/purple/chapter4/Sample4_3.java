package bronze.purple.chapter4;

public class Sample4_3 {
    public static void main(String[] args) {
        int num = 0;

//        繰り返し処理
        do {
            System.out.println("numの値は" + num + " です。" );
//            numの値に1加算
            num++;
//            条件判定 numが5未満かどうか
        } while (num < 5);
    }
}
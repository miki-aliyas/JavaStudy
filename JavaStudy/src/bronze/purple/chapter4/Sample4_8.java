package bronze.purple.chapter4;

public class Sample4_8 {
    public static void main(String[] args) {
//        外側の制御文 for
        for (int i = 1; i < 10 ; i++) {
//            内側の制御文
            if ((i % 4) ==0) {
                System.out.println(i + "は4の倍数です。");
            }
        }
    }
}

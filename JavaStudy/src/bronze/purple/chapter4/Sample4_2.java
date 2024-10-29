package bronze.purple.chapter4;

public class Sample4_2 {
    public static void main(String[] args) {
//        int num = 0; 以下に修正　（num変数を5で初期化する）
        int num = 5;
//        numの値が0より大きい間は以下を繰り返す
        while (num > 0) {
            System.out.println("numの値は" + num + "です。");
//            numの値から1減算
            num--;
        }
    }
}

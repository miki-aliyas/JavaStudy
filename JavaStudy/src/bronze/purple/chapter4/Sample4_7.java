package bronze.purple.chapter4;

public class Sample4_7 {
    public static void main(String[] args) {
//        配列の宣言
        char[] array = {'a','b','c','d','e'};
//        配列arrayの全要素を順番に取り出し、出力する
//        拡張for文で処理する場合
        for (char c : array) {
            System.out.print(c + "");
        }
//        改行
        System.out.println();
//        for文で処理する場合
        for (int count = 0 ; count < array.length ; count++) {
            System.out.print(array[count] + "");
        }
    }
}
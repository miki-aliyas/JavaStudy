package bronze.purple.chapter3;

public class Sample3_9 {
    public static void main(String[] args) {
        char c = 'P';

        if (c == 'a' ) {
            System.out.println("cの値はaです。");
        } else if (c == 'd') {
            System.out.println("cの値はbです。");
        } else {
            System.out.println("cの値はaでもbでもありません。");
            System.out.println("cの値は " + c + "です。");
        }
    }
}
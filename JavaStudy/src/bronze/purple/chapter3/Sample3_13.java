package bronze.purple.chapter3;

public class Sample3_13 {
    public static void main(String[] args) {
        int num = 3;

        switch (num) {
            case 1:
            case 2:
//                numの値が1か2の場合の処理
                System.out.println("1または2");
                break;
            case 3:
            case 4:
//                numの値が1か2の場合の処理
                System.out.println("3または4");
                break;
            default:
//                numの値が1か4以外の場合の処理
                System.out.println("default");
        }
    }
}

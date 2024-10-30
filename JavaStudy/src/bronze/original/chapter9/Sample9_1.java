package bronze.original.chapter9;

import java.util.Scanner;

public class Sample9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("何個*を表示しますか：");
        int count = scanner.nextInt();

        if (count > 0) {
            for (int i = 0; i < count; i++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

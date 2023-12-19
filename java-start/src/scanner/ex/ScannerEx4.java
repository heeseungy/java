package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("단을 입력하세요 : ");
        int num = input.nextInt();

        System.out.println(num + "단의 구구단: ");
        for (int n = 1; n <= 9; n++) {
            System.out.println(num + " * " + n + " = " + num * n);
        }
    }
}

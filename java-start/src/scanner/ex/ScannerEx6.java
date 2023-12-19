package scanner.ex;

import java.util.Scanner;

public class ScannerEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int a = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        int b = scanner.nextInt();

        // num1 이  num2 보다 큰 경우
        if (a > b) {
            int tmp = a;
            a = b;
            b = tmp;
        }

        System.out.println("두 숫자 사이의 모든 정수 : ");
        for (int i = a; i <= b; i++){
            System.out.print(i);
            if (i!=b)
                System.out.print(", ");
        }
    }
}

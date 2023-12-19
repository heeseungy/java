package scanner.ex;

public class ScannerEx5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int tmp = a;
        a = b;
        b = tmp;

        System.out.println("a는 " + a + " 입니다.");
        System.out.println("b는 " + b + " 입니다.");
    }
}

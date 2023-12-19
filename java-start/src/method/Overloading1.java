package method;

public class Overloading1 {
    public static void main(String[] args) {
        int num1 = add(1, 2);
        System.out.println(num1);
        int num2 = add(1, 2, 3);
        System.out.println(num2);
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }
}

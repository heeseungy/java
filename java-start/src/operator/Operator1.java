package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("a + b = " + sum);

        int diff = a - b;
        System.out.println("a - b = " + diff);

        int multi = a * b;
        System.out.println("a * b = " + multi);

        int div = a / b;  // int형끼리 계산해서 int형 div에 대입해서 소수점 날라감
        System.out.println("a / b = " + div);

        int mod = a % b;
        System.out.println("a % b = " + mod);
    }
}

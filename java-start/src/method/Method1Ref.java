package method;

public class Method1Ref {
    public static void main(String[] args) {
        int sum1 = add(5, 10);
        int sum2 = add(10, 20);

        System.out.println(sum1);
        System.out.println(sum2);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}

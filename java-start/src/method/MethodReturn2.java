package method;

public class MethodReturn2 {
    public static void main(String[] args) {

        checkAge(17);

    }

    public static void checkAge(int age)    {
        if (age < 19) {
            System.out.println("미성년자는 출입이 불가능합니다.");
            return;
        }
        System.out.println("입장 가능합니다.");
    }
}

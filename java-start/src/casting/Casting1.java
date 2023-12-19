package casting;

public class Casting1 {
    public static void main(String[] args) {
        // 형변환
        // 작은 값 -> 큰 값 에 대입하면 "자동형변환"이 발생한다.
        // 큰 값 -> 작은 값 에 대입하는 것은 불가능하다.
        // 결국 대입하는 형을 맞춰야한다. --> 강제 캐스팅 (=명시적 형변환)


        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = (long) intValue;
        System.out.println("longValue = " + longValue);

        doubleValue = (double) intValue;
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L;
        System.out.println("doubleValue2 = " + doubleValue);
    }
}

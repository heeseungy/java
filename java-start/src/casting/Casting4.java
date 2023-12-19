package casting;

public class Casting4 {
    public static void main(String[] args) {

        // 같은 타입끼리의 계산 = 같은 타입의 결과를 발생
        // 서로 다른타입의 계산 = 큰 범위로 "자동형변환" 발생

        int div1 = 3/2;
        System.out.println("div1 = " + div1);

        double div2 = 3/2;
        System.out.println("div2 = " + div2);

        double div3 = 3.0/2;
        System.out.println("div3 = " + div3);

        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4);
    }
}

package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("음식 이름을 입력해주세요 : ");
        String foodName = input.nextLine();

        System.out.println("음식의 가격을 입력해주세요 : ");
        int foodPrice = input.nextInt();

        System.out.println("음식의 수량을 입력해주세요 :");
        int foodQuality = input.nextInt();
        
        int totalPrice = foodPrice * foodQuality;
        System.out.println(foodName + " " + totalPrice + " 원 입니다.");
    }
}

package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자
    // 생성자의 장점1 : 직접 정의한 생성자가 있다면 직접 정의한 생성자를 반드시 호출하도록 "강제" 하는 것
    // * 컴파일 오류를 발생시켜 개발자가 바로 알아차릴 수 있음

    // 좋은 프로그램은 무한한 자유도가 주어지는 프로그램이 아니라 적절한 제약이 잇는 프로그램이다.
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name=" + name + " age=" + age + " grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    MemberConstruct(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 50;
    }
}

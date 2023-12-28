package OOP;
/*
    getter, setter가 포함된 클래스의 상속을 코드로 구현해보시오.
    이 문제는 클래스의 상속을 구현시 getter, setter의 개념과 용도를 알고 있는지를 묻는 문제이다.
    부모 클래스 --> Person, 자식 클래스 --> Villain, Hero
 */

public class Java100_oop_InheritanceSample6 {
    public static void main(String[] args) {
        /* 생성자로 만들면 더 편할텐데...
        Villain villain1 = new Villain("좀비", 20, 180, 80, 15001231, "창", 99.5);
        Villain villain2 = new Villain("도깨비", 30, 175, 70, 11001121, "방패", 140.5);
        Villain villain3 = new Villain("몽달귀신", 40, 150, 40, 14001011, "", 11.5);
         */

        //Villain 객체 생성
        Villain villain1 = new Villain();
        Villain villain2 = new Villain();
        Villain villain3 = new Villain();

        //setter로 값 지정
        villain1.setName("좀비");
        villain1.setAge(20);
        villain1.setHeight(180);
        villain1.setWeight(80);
        villain1.setNumber(15001231);
        villain1.setWeapon("창");
        villain1.setPower(99.5);

        //getter로 값 출력
        System.out.println("----------------------------------");
        System.out.println("악당 이름 : " + villain1.getName());
        System.out.println("악당 나이 : " + villain1.getAge());
        System.out.println("악당의 키 : " + villain1.getHeight());
        System.out.println("악당 체중 : " + villain1.getWeight());
        System.out.println("악당 넘버 : " + villain1.getNumber());
        System.out.println("악당 무기 : " + villain1.getWeapon());
        System.out.println("악당 파워 : " + villain1.getPower());
        System.out.println("----------------------------------");
        System.out.println(villain1.getName() + " 이동중..");
    }
}

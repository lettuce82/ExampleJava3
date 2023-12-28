package OOP;
/*
    객체 생성시 초깃값을 생성자 메서드에서 설정하는 클래스를 구현해보시오.
    이 문제는 클래스의 인스턴스 생성시 생성자를 통해서 초기화하는 것을 알고 있는지 묻는 문제이다.

    ---------------------------------------------------------
    [내 풀이]

    ---------------------------------------------------------
    [쌤 풀이]
 */

public class Java100_oop_Exam006 {
    public static void main(String[] args) {
        //Human 객체 생성 & 생성자 호출
        Human human1 = new Human(20, "홍길동");
        Human human2 = new Human(30, "이순신");
        Human human3 = new Human(40, "을지문덕");

        //멤버변수 출력 메서드 호출
        human1.printHuman();
        human2.printHuman();
        human3.printHuman();
    }
}

class Human {
    //필드 선언
    int age;
    String name;

    //생성자 -> age, name 값 받고 출력
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        
        //기본 생성자에서 출력문도 함께 적어주면 안 되나... 생각을 좀 해 봄 -> 출력 화면은 똑같다
        //System.out.println("나이 : " + this.age + ", 이름 : " + this.name);
    }

    void printHuman() {
        System.out.println("나이 : " + this.age + ", 이름 : " + this.name);
    }
}

package OOP;

/*
    FarmMachine의 속성과 동작들을 가지는 클래스를 코드로 구현하고 객체를 생성하여 동작시켜보시오.
    이 문제는 어떤 사물에 대한 클래스를 실제 코드로 구현할 수 있는지를 묻는 문제이다.
 */
public class Java100_oop_Exam002 {
    public static void main(String[] args) {
        //FarmMachine 객체 생성
        FarmMachine farmMachine = new FarmMachine();

        //FaramMachine의 필드값 출력
        System.out.println(farmMachine.price);
        System.out.println(farmMachine.madeDate);
        System.out.println(farmMachine.color);

        //FaramMachine의 메서드 호출
        farmMachine.move();
        farmMachine.dig();
        farmMachine.grind();
    }
}

class FarmMachine {
    //필드
    int price = 1000000;
    int madeDate = 2020;
    String color = "red";
    
    //메서드
    void move() {
        System.out.println("Farm-machine is moving.");
    }
    void dig() {
        System.out.println("Farm-machine is digging.");
    }
    void grind() {
        System.out.println("Farm-machine is grinding.");
    }
}
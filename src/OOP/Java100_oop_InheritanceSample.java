package OOP;
/*
    클래스의 상속을 코드로 구현해보시오.
    이 문제는 자바 OOP 문법에서 상속에 대한 개념과 그것을 코드로 구현할 수 있는지를 묻는 문제이다.

    --------------------------------
    [내 풀이]

    --------------------------------
 */

public class Java100_oop_InheritanceSample {
    public static void main(String[] args) {
        //부모 & 자식 클래스 객체 생성 + 생성자 호출
        ParentClass parentClass = new ParentClass("슈퍼맨", 20, 1, 100);
        ChildClass childClass1 = new ChildClass("원더우먼", 30, 1, 100);
        ChildClass childClass2 = new ChildClass("원더우먼", 30, 2, 300);
        
        //walk & print 메서드 호출
        parentClass.walk();
        parentClass.print();
        childClass1.print();
        childClass2.print();
        childClass1.walk();
    }
}

class ParentClass {
    String name;
    int age;
    int gender;
    int power;

    public ParentClass(String name, int age, int gender, int power) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.power = power;
    }

    void walk() {
        System.out.println("부모 클래스 -> 걸어가고 있어요~");
    }
    void print() {
        System.out.println("이름 : " + this.name + ", 나이 : " + this.age + ", 성별 : " + this.gender + ", 파워 : " + this.power);
    }
}

class ChildClass extends ParentClass {

    public ChildClass(String name, int age, int gender, int power) {
        super(name, age, gender, power);
    }

    @Override
    void walk() {
        System.out.println("자식 클래스 -> 2배로 빨리 걸어가고 있어요~");
    }

    @Override
    void print() {
        System.out.println("이름 : " + this.name + ", 나이 : " + this.age + ", 성별 : " + this.gender + ", 파워 : " + this.power);
    }
}

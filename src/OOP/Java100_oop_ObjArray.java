package OOP;

import java.util.Arrays;

/*
    객체에 대한 참조값을 요소로 가지는 객체 배열 코드를 구현하시오.
    이 문제는 기본형 타입이 아닌 참조형 타입의 객체가 원소인 객체 배열을 구현할 수 있는지를 묻는 문제이다.
 */
public class Java100_oop_ObjArray {
    public static void main(String[] args) {
        //Candidate 객체와 객체를 담을 배열 선언

        Candidate[] candidates = new Candidate[10];

        for (int i = 0; i < 10; i++) {
            candidates[i] = new Candidate(i + 20);
            System.out.println(i + "번 후보자 --> 나이 : " + candidates[i].getAge());
        }
    }
}

class Candidate {
    private int age;

    public Candidate(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

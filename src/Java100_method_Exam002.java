/*
    반환값이 없고 받는 인자값이 2개 있는 덧셈 메서드를 구현하시오.
    이 문제는 자바의 메서드 작성법과 반환값, 인자값에 대한 이해가 있는지를 묻는 문제이다.

    [내 풀이]
    1. 반환값이 없고 -> void
    2. 인자값 2개 -> 매개변수 2개
    3. main 에서 작동되어야 하므로 static

    --------------------------------------------------------------

    [쌤 풀이]

 */

public class Java100_method_Exam002 {

    public static void addNum(int num1, int num2) {
        //인자값 확인
        System.out.printf("인자로 넘겨받은 2개의 값은 %d, %d입니다.%n", num1, num2);
        System.out.println(num1 + num2);
    }


    public static void main(String[] args) {
        addNum(1,2);
    }
}

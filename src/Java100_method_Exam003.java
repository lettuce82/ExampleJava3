/*
    반환값이 있고 받는 인자값이 없는 메서드를 구현하시오.
    이 문제는 자바의 메서드 작성법과 반환값, 인자값에 대한 이해가 있는지를 묻는 문제이다.

    [내 풀이]
    1. 반환값이 있고 -> void 가 아닌 반환값으 Type으로 메서드 반환타입 설정
    2. 인자값 없는 -> 메서드 () 안에 빈칸으로 두기
    3. main 에서 작동되어야 하므로 static

    --------------------------------------------------------------

    [쌤 풀이]

 */

public class Java100_method_Exam003 {

    public static int noParam() {
        return 1 + 2;
    }


    public static void main(String[] args) {
        System.out.println(noParam());
    }
}

/*
    반환값이 있고 받는 인자값이 있는 대문자 출력 메서드를 구현하시오.
    메서드는 ( "korea" ) 입력시 대문자로 출력되도록 구현한다.
    이 문제는 자바의 메서드 작성법과 반환값, 인자값에 대한 이해가 있는지를 묻는 문제이다.

    [내 풀이]
    1. 반환값이 있고 -> void 가 아닌 반환값으 Type으로 메서드 반환타입 설정
    2. 인자값 있는 -> 메서드 () 안에 전달받을 매개변수 기입
    3. main 에서 작동되어야 하므로 static

    --------------------------------------------------------------

    [쌤 풀이]

 */

public class Java100_method_Exam004 {

    public static String changeUpper(String s) {
        return s.toUpperCase();
    }


    public static void main(String[] args) {
        String lowerS = "korea";
        String UpperS = changeUpper(lowerS);
        System.out.println("입력한 소문자의 대문자는 = "+ UpperS);
    }
}

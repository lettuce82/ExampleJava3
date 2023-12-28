package OOP;

/*
    문자열을 숫자로 바꿔서 연산해보시오.
    이때, 인자값으로 진수를 지정해서 출력해보시오.
    이 문제는 자바 프로그래밍시 문자열을 숫자로 변환시키는 것에 대해서 아는지를 묻는 문제이다.

    -------------------------------------------------------------------

    [내 풀이]
    *** Integer.parseInt 는 알았지만 괄호 안에 진수를 지정할 수 있었는지는 몰랐다. ***
    *** 진수에 대한 개념이 부족 / 2진수 -> 10진수 or 10진수 -> 2진수 공부하기
    *** 16진수의 A = 10진수로 10 / 16진수의 F = 10진수로 15
    *** 16진수의 FF = 10진수로 255

    -------------------------------------------------------------------

    [쌤 풀이]
    Integer.parseInt
 */

public class Java100_oop_ParseInt {
    public static void main(String[] args) {
        //문자열 변수 선언
        String a = "1010";
        String b = "20";

        //문자열 변수 -> int 변수로 파싱
        int a1 = Integer.parseInt(a);
        int b2 = Integer.parseInt(b);

        //int 변수값의 합 출력
        int sum = a1 + b2;
        System.out.println(sum);

        //인자값으로 진수를 지정하여 출력
        a1 = Integer.parseInt(a, 2);
        b2 = Integer.parseInt(b, 10);

        //진수 변환한 값으로 출력
        System.out.println(a1);
        System.out.println(b2);
    }
}

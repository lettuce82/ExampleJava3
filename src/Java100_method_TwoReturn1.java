import java.util.Arrays;

/*
    2개의 정수형 값을 리턴하는 메서드를 구현하시오.
    이 문제는 두개의 리턴 값을 반환하는 메서드 작성법을 아는지에 대해서 묻는 문제이다.

    -----------------------------------------------------------------------

    [내 풀이]
    배열 활용

    -----------------------------------------------------------------------

    [쌤 풀이]

    - 추가 내용
    Arrays.toString 으로 반복문 사용 없이 출력할 수 있음
 */
public class Java100_method_TwoReturn1 {
    public static void main(String[] args) {
        for (int i : arrNum()) {
            System.out.println(i);
        }
        System.out.println( Arrays.toString(arrNum()) ); //Arrays.toString 으로 반복문 사용 없이 출력할 수 있음
    }

    public static int[] arrNum() {
        int num1 = 100;
        int num2 = 200;
        return new int[]{num1, num2};
    }
}

import java.util.Arrays;

/*
    반환값이 2개 있는 메서드를 구현해보시오.
    메서드는 ( "korea", "USA" ) 입력시 소문자는 대문자로 대문자는 소문자로 출력되도록 구현한다.
    이 문제는 자바의 메서드 작성시 리턴되는 반환값이 2개일 때 처리하는 방법을 아는지에 대해서 묻는 문제이다.

    -----------------------------------------------------------------------

    [내 풀이]
    배열 활용: 배열 생성 후 변환 전 string 값을 담은 후 변환 -> 변환된 배열을 반환

    -----------------------------------------------------------------------

    [쌤 풀이]
    배열 활용: 배열에 담을 string 값을 미리 변환 후 배열에 담기 -> 해당 배열 반환
    ----------------------------
    String a_ = a.toUpperCase();
    String b_ = b.toLowerCase();

    // 리턴값 2개를 저장할 배열 변수 선언
    String[] ret = { a_, b_ };
    return ret;
    ----------------------------
    ㄴ 하지만 이 경우 String a_ 변수에 대문자가 들어갈 경우 소문자로 변환할 수 없음
    ㄴ b_에 소문자가 들어갈 때도 마찬가지

 */
public class Java100_method_TwoReturn2 {
    public static void main(String[] args) {
        //반환된 배열을 담을 String 타입의 배열 선언
        String[] arrString = changeString();

        //배열에 담긴 값 출력
        System.out.println(arrString[0] + " - " + arrString[1]);
    }

    public static String[] changeString() {
        //String 타입의 배열 선언
        String[] strings = new String[]{"korea", "USA"};

        //반복문으로 배열에 담긴 값 변환 후 다시 배열에 담기
        for (int i = 0; i < strings.length; i++) {
            if (!strings[i].equals(strings[i].toUpperCase())) {
                strings[i] = strings[i].toUpperCase();
            } else if (!strings[i].equals(strings[i].toLowerCase())) {
                strings[i] = strings[i].toLowerCase();
            }
        }

        //변환된 배열 반환하기
        return strings;
    }
}

import java.util.Arrays;

/*
    반환값이 2개 있는 메서드를 구현해보시오.
    메서드는 ( "korea", "USA" ) 입력시 소문자는 대문자로 대문자는 소문자로 출력되도록 구현한다.
    이 문제는 자바의 메서드 작성시 리턴되는 반환값이 2개일 때 처리하는 방법을 아는지에 대해서 묻는 문제이다.

    -----------------------------------------------------------------------

    [내 풀이]
    [방법 1] 이중 배열 활용
    [방법 2 ] static 클래스 생성 후 static 변수로 배열을 만들어 직접 접근하는 방법
    -----------------------------------------------------------------------

    [쌤 풀이]

 */
public class Java100_method_TwoReturn2 {
    public static void main(String[] args) {
        for (int i = 0; i < changeString().length; i++) {
            for (int j = 0; j < changeString()[i].length; j++) {
                System.out.println(changeString()[i][j]);
            }
        }
    }

    public static String[][] changeString() {
        String[] beforeStrings = new String[]{"korea", "USA"};
        String[] afterStrings = new String[beforeStrings.length];

        for (int i = 0; i < beforeStrings.length; i++) {
            if (!beforeStrings[i].toUpperCase().equals(beforeStrings[i])) {
                afterStrings[i] = beforeStrings[i].toUpperCase();
            } else if (!beforeStrings[i].toLowerCase().equals(beforeStrings[i])) {
                afterStrings[i] = beforeStrings[i].toLowerCase();
            }
        }
        String[][] strings = {beforeStrings, afterStrings};
        return strings;
    }
}

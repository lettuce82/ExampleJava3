/*
    메인 메서드에서 100을 보냈을 때 값이 수정되게끔 Call by reference 방식으로 코드를 수정하시오.
    이 문제는 앞서 다뤘던 문제의 Call by value 방식을 Call by reference 방식으로 수정해서 보내라는 의미다.
    a 값이 같은 결과가 나오도록 코드를 수정해보시오.

    -------------------------------------------------------------

    [내 풀이]
    1. 방법
    1) sum 메서드를 void가 아닌 int 형을 반환하는 메서드로 변경한 후 메인 메서드에서 a 변수에 해당 반환값으로 오버라이딩하기.
    2) 참조형 변수...? 클래스를 만든 후 인스턴스를 만들어야 하나?

    -------------------------------------------------------------

    [쌤 풀이]
    - 추가 내용
    Integer 는 Wrapper 클래스인데 해당 클래스의 인스턴스 값을 전달하면 클래스의 참조값이 아닌 실제 들어있는 기본형 값이 전달된다.

    *** Wrapper 클래스, Integer 에 대한 개념이 부족함 ***

 */


public class Java100_method_MethodCall2 {
    /*
    [방법 1]
    public static int sum(int a) {
        a += 400;
        System.out.println(a);
        return a;
    }
     */
    public static void sum( Integer a ) {
        a += 400;
        System.out.println( a ); //클래스의 참조값이 아닌 100이라는 값이 출력됨
    }
    public static void main(String[] args) {
        Integer a = new Integer(100); //Integer 라는 Wrapper 클래스의 인스턴스 전달
        sum(a);
        System.out.println( a );
    }
}

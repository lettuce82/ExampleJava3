package OOP;

/*
    1000000원을 가진 변수를 천단위로 콤마를 찍어서 출력시켜보시오.
    이 문제는 천단위로 콤마(,)를 찍는 문제인데 여러가지 방법중 손쉽게 할 수 있는 방법으로 풀어본다.
    아래는 앞서의 FarmMachine 클래스 문제인데 가격을 천단위로 콤마 찍어서 출력해보세요.

    ------------------------------------------------------------------------------

    [내 풀이]
    printf 사용하기

    ------------------------------------------------------------------------------

    [쌤 풀이]
    System.out.println( String.format( "%,d", fm.price ) );
    ㄴ 전혀 모르는 부분임
    ㄴ 형식을 설정할 때 사용
    ㄴ %,d -> 천 단위마다 ,를 찍어줌 (다른 부호는 사용 불가)
 */
public class Java100_oop_Exam003 {
    public static void main(String[] args) {
        //FarmMachine 객체 생성
        FarmMachine farmMachine = new FarmMachine();

        //FaramMachine의 필드값 출력
        //[내 풀이]
        System.out.printf("%,d%n", farmMachine.price);
        //[쌤 풀이]
        System.out.println(String.format("%,d" , farmMachine.price));
        System.out.println(farmMachine.madeDate);
        System.out.println(farmMachine.color);

        //FaramMachine의 메서드 호출
        farmMachine.move();
        farmMachine.dig();
        farmMachine.grind();
    }
}


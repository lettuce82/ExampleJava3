/*
    static 선언이 안되어있는 메서드를 사용하는 방법에 대해서 코드로 구현해보시오.
    이 문제는 메인 메서드에서 static 선언이 없는 메서드를 사용하는 방법에 대해서 아는지를 묻는 문제이다.
    참고로 이 문제는 클래스와 객체에 대한 선행 학습이 필요하므로 이에 대한 학습 후 본 문제를 다시 풀어보는 것이 좋다.

    [내 풀이]

    1. 원인
    static 메서드인 main 메서드가 인스턴스 메서드인 hellowWorld() 메서드를 호출하지 못하는 이유는
    인스턴스 메서드는 메서드에 접근하기 위하여 해당 인스턴스의 참조값을 알아야 하는데,
    인스턴스을 생성하지 않아 해당 인스턴스의 참조값을 알 수 없기 때문이다.
    
    2. 해결방법
    해당 인스턴스 메서드를 포함하는 클래스의 객체를 생성한 후 참조값을 통하여 접근하여 메서드를 호출한다.

   ----------------------------------------------------------------

    [쌤 풀이]
    
*/

public class Java100_method_ExamStatic2 {

    public void helloWorld() {
        System.out.println( "Hello, World~" );
    }

    public static void main(String[] args) {
        //객체 생성
        Java100_method_ExamStatic2 java100MethodExamStatic2 = new Java100_method_ExamStatic2();
        
        //메서드 호출
        java100MethodExamStatic2.helloWorld();

    }
}

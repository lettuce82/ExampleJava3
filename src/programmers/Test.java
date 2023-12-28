package programmers;

public class Test {
    boolean solution(String s) {
        boolean answer = true; //정답 변수

        String[] array_word; // 스트링을 담을 배열
        int openNum = 0; //여는 괄호의 개수
        int closeNum = 0; //닫는 괄호의 개수


        array_word = s.split(""); //배열에 한글자씩 저장하기

        for(int i=0;i<array_word.length;i++) {
            //첫번째 글자가 닫는 괄호면 무조건 false
            if (!array_word[0].equals(")")) {
                //여는 괄호로 시작하는 배열중 여는 괄호와 닫는 괄호 개수 구하기
                switch (array_word[i]) {
                    case "(" -> {
                        openNum++;
                    }
                    case ")" -> {
                        closeNum++;
                    }
                }
                //마지막 배열 검토 후 여는 괄호와 닫는 괄호의 개수 비교하기
                if (i == array_word.length-1) {
                    if (openNum != closeNum) {
                        answer = false;
                    } else {
                        answer = true;
                    }
                }
            } else{
                answer = false;
            }
            //여는 괄호가 있고 그 후에 닫는 괄호가 있어야함
            //여는 괄호의 갯수가 닫는 괄호의 갯수와 동일해야함
        }
        return answer;
    }

    public static void main(String[] args) {
        Test test = new Test();
        boolean result = test.solution("(()(");
        System.out.println(result);
    }
}

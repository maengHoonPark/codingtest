package programmers.입문;

public class 문자열안에문자열 {

    public static void main(String[] args) {
        System.out.println(solution("asdfzzzz", "asd"));
    }

    public static int solution(String st1, String st2) {
        if (st1.contains(st2)){
            return 1;
        } else {
            return 2;
        }
    }
}

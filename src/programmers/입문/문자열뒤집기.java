package programmers.입문;

public class 문자열뒤집기 {

    public static void main(String[] args) {
        System.out.println(solution("abcd"));
    }
    public static String solution (String my_string) {
        return new StringBuilder(my_string).reverse().toString();
    }
}

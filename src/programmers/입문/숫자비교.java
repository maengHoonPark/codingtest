package programmers.입문;

public class 숫자비교 {
    public static void main(String[] args) {
        System.out.println(solution(7,99));
    }
    public static int solution(int num1, int num2){
        if (num1 == num2){
            return 1;
        } else {
            return -1;
        }
    }
}

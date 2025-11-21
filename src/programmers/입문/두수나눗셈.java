package programmers.입문;

public class 두수나눗셈 {
    public static void main(String[] args) {
        System.out.println(solution(7,3));
    }
    public static int solution(int num1, int num2){
        return (int) ((double) num1/num2*1000);
    }
}

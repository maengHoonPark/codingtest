package programmers.입문;

public class 세균증식 {

    public static void main(String[] args) {
        System.out.println(solution(2,10) );
    }

    public static int solution(int n, int t) {
        // return n << t; -> a × 2^b
        for (int i = 0; i < t; i++) {
            n = n*2;
        }
        return n;
    }
}

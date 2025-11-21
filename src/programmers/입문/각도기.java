package programmers.입문;

public class 각도기 {

    public static void main(String[] args) {
        System.out.println(solution(30));
    }
    public static int solution(int angel) {
        if (angel > 0 && angel<90) {
            return 1;
        } else if (angel == 90) {
            return 2;
        } else if (angel>90 && angel <180) {
            return 3;
        } else {
            return 4;
        }
    }
}

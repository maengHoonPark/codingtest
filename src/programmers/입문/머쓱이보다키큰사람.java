package programmers.입문;

public class 머쓱이보다키큰사람 {

    public static void main(String[] args) {
        int[] arr = {149,180,192,170};
        System.out.println(solution(arr, 167));
    }
    public static int solution(int[] arr, int height) {
        int max = 0;
        for (int n : arr) {
            if (n > height) {
                max++;
            }
        }
        return max;
    }
}

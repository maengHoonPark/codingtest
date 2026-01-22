package programmers.입문;

import java.util.Arrays;

public class 최댓값만들기 {
    public static void main(String[] args) {
        int[] numbers = {0,31,24,10,1,9};
        System.out.println(solution(numbers));
    }
    public static int solution(int[] numbers) {
//        Arrays.sort(numbers);
//        int n = numbers.length;
//        return numbers[n-1] * numbers[n-2];
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int n :  numbers) {
            if ( n > max1) {
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max2 = n;
            }
        }
        return max1 * max2;
    }
}

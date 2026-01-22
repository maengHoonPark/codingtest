package programmers.입문;

import java.util.Arrays;

public class n의배수 {

    public static void main(String[] args) {
        int[] numlist = {6,9,12,1,2,4};
        System.out.println(Arrays.toString(solution(3, numlist)));
    }
    public static int[] solution(int n, int[] numlist) {
        int count = 0;
        for (int num : numlist) {
            if (num % n == 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int num : numlist) {
            if (num % n == 0) {
                result[index++] = num;
            }
        }
        return result;


    }
}

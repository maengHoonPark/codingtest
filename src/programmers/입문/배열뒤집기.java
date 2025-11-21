package programmers.입문;

import java.util.Arrays;

public class 배열뒤집기 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution(arr)));
    }
    public static int[] solution(int[] num_list) {
        int[] temp = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++) {
            temp[i] = num_list[num_list.length - 1 - i];
        }
        return temp;
    }
}

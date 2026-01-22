package programmers.입문;

import java.util.Arrays;

public class 아메리카노 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(6500)));
    }

    public static int[] solution(int money) {
        int cups = money / 5500;
        int change =  money % 5500;
        return new int[]{cups, change};
    }
}

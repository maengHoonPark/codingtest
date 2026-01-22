package programmers.입문;

import java.util.Arrays;

public class 배열원소의길이 {

    public static void main(String[] args) {
        String[] strlist = {"asf", "asf", "qq"};
        System.out.println(Arrays.toString(solution(strlist)));

    }

    public static int[] solution(String[] strlist) {
        int[] result = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            result[i] = strlist[i].length();
        }
        return result;
    }
}

package programmers.입문;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(solution("abc1abc1abc"));
        System.out.println(solution1(3,4, new boolean[] {true, false, false, true, true}));
        System.out.println(solution4(new int[] {3,4,5,2,1}));
    }
    public static String solution(String code){
        StringBuilder ret = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = 1 - mode;
            } else {
                if (mode == 0 && i % 2 == 0) {
                    ret.append(code.charAt(i));
                }
                if (mode == 1 && i % 2 == 1) {
                    ret.append(code.charAt(i));
                }
            }
        }
        return ret.toString();
    }
    public static int solution1(int a, int d, boolean[] included){
        int result = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i] == true) {
                result += a + (i * d);
            }
        }
        return result;
    }
    public static int solution2(int a, int b, int c) {
        if (a == b && b == c) {
            return (a+b+c) * (a*a+b*b+c*c) * (a*a*a+b*b*b+c*c*c);
        } else if (a == b || a == c || b == c) {
            return (a+b+c) * (a*a+b*b+c*c);
        } else {
            return a+b+c;
        }
    }
    public static int solution3(int[] num_list) {
        int sum = 0, gop = 1;

        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            gop *= num_list[i];
        }

        int sumSquare = sum * sum;

        return gop < sumSquare ? 1 : 0;
    }
    public static int solution4(int[] num_list) {
        StringBuilder evenStr =  new StringBuilder(); // 짝
        StringBuilder oddStr =  new StringBuilder();
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                evenStr.append(num_list[i]);
            } else {
                oddStr.append(num_list[i]);
            }
        }
        int even = Integer.valueOf(evenStr.toString());
        int odd = Integer.valueOf(oddStr.toString());
        return odd + even;
    }
    public static int solution5(int n, String control) {
        for (int i = 0; i < control.length(); i++) {
            char c = control.charAt(i);

            switch (c) {
                case 'w' :
                    n += 1;
                    break;
                case 's' :
                    n -= 1;
                    break;
                case 'd' :
                    n += 10;
                    break;
                case 'a' :
                    n -= 10;
                    break;
            }
        }
        return n;
    }
}

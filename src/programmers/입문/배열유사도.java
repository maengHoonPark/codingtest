package programmers.입문;

public class 배열유사도 {

    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"d", "b", "c", "sa"};
        System.out.println(solution(s1, s2));
    }

    public static int solution(String[] s1, String[] s2) {
        int dupli = 0;
        for (String x : s1) {
            for (String y : s2) {
                if (x.equals(y)) {
                    dupli++;
                }
            }
        }
        return dupli;
    }
}

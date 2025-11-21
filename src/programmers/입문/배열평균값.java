package programmers.입문;
/*
정수 배열 numbers가 매개변수로 주어집니다.
numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
 */
public class 배열평균값 {

    public static void main(String[] args) {
        int[] numners = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(solution(numners));
    }
    public static double solution(int[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum / numbers.length;
    }

}

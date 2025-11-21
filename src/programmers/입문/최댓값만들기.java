package programmers.입문;

public class 최댓값만들기 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(solution(numbers));
    }
    public static int solution(int[] numbers) {
        int temp = numbers[0];
        int temp2 = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(temp < numbers[i]){
                temp = numbers[i];
            }
            if (temp < temp2){
                temp2 = numbers[i];
            }
        }
        return temp * temp2;
    }
}

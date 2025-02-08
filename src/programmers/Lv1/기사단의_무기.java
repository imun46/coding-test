package programmers.Lv1;

public class 기사단의_무기 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int number, int limit, int power) {
                int answer = 0;

                //1. 1~number 약수 배열로 구하기
                //2. 약수가 담긴 배열을 limit과 비교
                //3. limit 넘으면 power 로 계산

                int[] array = new int[number];
                for (int i = 0; i < array.length; i++) {
                    int count = 0;
                    int n = 1;
                    while(n <= i+1) {
                        if((i+1) % n == 0) {
                            count++;
                        }
                        n++;
                    }
                    array[i] = count;
                    System.out.println(array[i]);
                }


                for (int i = 0; i < array.length; i++) {
                    if(array[i] > limit) {
                        answer += power;
                    }else{
                        answer += array[i];
                    }
                }

                return answer;
            }
        }
        Solution solution = new Solution();
        System.out.println(solution.solution(10,3,2));
    }
}

package programmers.Lv2;

public class 숫자의_표현 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                int answer = 0;
                /*for (int i = 1; i <= n; i++) {
                    int sum = 0;
                    for (int j = i; j <= n; j++) {
                        sum += j;

                        if(sum == n){
                            answer++;
                            break;
                        }
                        if (sum > n){
                            break;
                        }
                    }
                }*/

                /* for문 하나로 접근 */
                /*
                * 어떤 수 n이 k개의 연속된 자연수의 합으로 표현될 수 있는 경우는,
                * n은 k의 배수이기 때문 => n의 홀수 약수 개와 동일
                */

                for (int i = 1; i <= n; i+=2) {
                    if(n%i == 0){
                        answer++;
                    }
                }
                return answer;
            }




        }
        Solution solution = new Solution();
        System.out.println(solution.solution(15));
    }
}

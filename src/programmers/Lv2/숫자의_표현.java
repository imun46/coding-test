package programmers.Lv2;

public class 숫자의_표현 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                int answer = 0;
                for (int i = 1; i <= n; i++) {
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
                }

                return answer;
            }
        }
        Solution solution = new Solution();
        System.out.println(solution.solution(15));
    }
}

package programmers.Lv2;

public class 숫자의_표현 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                int answer = 0;
                int count = 0;

                for (int i = 1; i <= n; i++) {
                    int result = 0;
                    for (int j = count; j <= n; j++) {
                        if(result == n){
                            answer++;
                            break;
                        }
                            result += j;
                    }
                    count++;
                }

                return answer;
            }
        }
        Solution solution = new Solution();
        System.out.println(solution.solution(15));
    }
}

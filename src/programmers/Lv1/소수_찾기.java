package programmers.Lv1;

public class 소수_찾기 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                int answer = 0;


                /*
                    소수를 판별할 때 j는 √i까지만 검사하면 충분
                    예: i = 100일 때, 2~99까지 검사하는 대신 2~10까지만 검사해도 됨.
                    이유: n = a * b가 성립할 때, a와 b 중 적어도 하나는 √n 이하이기 때문.
                 */
                if(n < 2) return answer;
                for (int i = 2; i <= n; i++) {
                    boolean isPrime = true;
                    for (int j = 2; j <= Math.sqrt(j); j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) { answer++;}
                }

                return answer;
            }
        }
        Solution solution = new Solution();
        System.out.println(solution.solution(5));
    }
}

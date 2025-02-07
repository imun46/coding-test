package programmers.Lv1;

public class 소수_찾기 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
                int answer = 0;
                int count = 1;
                boolean check = false;


                for (int i = 1; i <= n; i++) {
                    for (int j = 2; j < count; j++) {
                        if(count % j == 0) {
                            check = false;
                            break;
                        }
                        check = true;
                    }
                    answer = check ? answer + 1 : answer + 0;
                    count ++;
                }
                return answer;
            }
        }
        Solution solution = new Solution();
        System.out.println(solution.solution(5));
    }
}

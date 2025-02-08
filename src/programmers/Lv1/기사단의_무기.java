package programmers.Lv1;

public class 기사단의_무기 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int number, int limit, int power) {
                int answer = 0;

                //1. 1~number 약수 구하기 -> 1~number 까지 다 구하는게 아니라 반만 체크해서 구하고
                //2. 찾은 개수 만큰 또 count++(단, 중복 값 빼주기)
                //3. limit 넘으면 power 로 계산

                for (int i = 1; i <= number; i++) {
                    int count = 0;
                    for (int j = 1; j <= Math.sqrt(i); j++) {
                        if(i % j == 0) {
                            count++;
                            if( j != i / j ) count++;
                        }
                    }
                    System.out.println(count);
                    if(count > limit){
                        answer += power;
                    }else{
                        answer += count;
                    }
                }

                return answer;
            }
        }
        Solution solution = new Solution();
        System.out.println(solution.solution(10,3,2));
    }
}

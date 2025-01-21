package programmers;

import java.util.*;

public class 두개뽑아서더하기 {

    /*
    * 정수 배열 numbers가 주어집니다.
    * numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아
    * return 하도록 solution 함수를 완성해주세요.
    *
    * */
    public static void main(String[] args) {
        class Solution {
            public int[] solution(int[] numbers) {

                /*
                * set 중복 제거 해서 담고  =>  list 변환 => 배열로 저장
                * */

                Set<Integer> set = new HashSet<>(); // set은 중복 자동 제거

                for (int i = 0; i < numbers.length-1; i++) {
                    for (int j = i + 1; j < numbers.length; j++) {
                        set.add(numbers[i]+numbers[j]);
                    }
                }

                List<Integer> list = new ArrayList<>(set);
                Collections.sort(list);

                int[] answer = new int[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    answer[i] = list.get(i);
                }
                return answer;
            }

    }
        Solution sol = new Solution();
        int[] nums = {2, 1, 3, 4, 1};
        int[] result = sol.solution(nums);
        System.out.println(Arrays.toString(result));
    }

}

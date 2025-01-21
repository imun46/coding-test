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
                List<Integer> list = new ArrayList<>();
                int count = 0;

                for (int i = 0; i < numbers.length-1; i++) {
                    for (int j = i + 1; j < numbers.length; j++) {
                        list.add(numbers[i]+numbers[j]);
                    }
                }
                for (int i = 0; i < list.size()-1; i++) {
                    for (int j = i + 1; j < list.size(); j++) {
                        if(list.get(i).equals(list.get(j))){
                            list.remove(j);
                        }
                    }
                }

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

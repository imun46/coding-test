package programmers.Lv1;

import java.util.*;

public class 과일_장수 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int k, int m, int[] score) {
                int answer = 0;
                List<Integer> list = new ArrayList<>();

                for (int i = 0; i < score.length; i++) {
                    list.add(score[i]);
                }
                list.sort(Comparator.reverseOrder());

                int rowPoint = list.get(list.size() - 1);
                int count = 1;
                for (int i = 0; i < list.size(); i++) {
                    if(i > 0 && i % (m*count-1) == 0){
                        count++;
                        if(list.get(i) == rowPoint && rowPoint != k){ // 2
                            answer += rowPoint * m;
                        }else{
                            answer += list.get(i) * m;
                        }
                    }
                }

                return answer;
            }
        }
        Solution solution = new Solution();
        System.out.println(solution.solution(4,3,new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }
}

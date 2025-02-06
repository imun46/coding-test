package programmers.Lv1;

import java.util.HashMap;

public class 포켓몬 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int[] nums) {
                int answer = 0;
                HashMap<Integer, Integer> map = new HashMap<>();

                for (int i = 0; i < nums.length; i++) {
                    map.put(nums[i], nums[i]);
                }

                return nums.length/2 > map.size() ? map.size() : nums.length/2;
            }
        }
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{3,1,2,3}));
    }

}


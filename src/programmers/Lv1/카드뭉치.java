package programmers.Lv1;

public class 카드뭉치 {
    public static void main(String[] args) {
        class Solution {
            public String solution(String[] cards1, String[] cards2, String[] goal) {
                String answer = "No";
                int count1 = 0;
                int count2 = 0;

                for (int i = 0; i < goal.length; i++) {
                    if (count1 < cards1.length && cards1[count1].equals(goal[i])) {
                        answer = "Yes";
                        count1++;
                    }else if (count2 < cards2.length && cards2[count2].equals(goal[i])) {
                        answer = "Yes";
                        count2++;
                    }else{
                       return answer = "No";
                    }
                }

                return answer;
            }
        }
        Solution solution = new Solution();
        String result = solution.solution(new String[] {"i", "drink", "water"}, new String[] {"want", "to"}, new String[] {"i", "want", "to", "drink", "waterf"});
        System.out.println(result);
    }
}

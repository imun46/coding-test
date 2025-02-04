package programmers;

import java.util.ArrayList;
import java.util.List;

public class 추억점수 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(String[] name, int[] yearning, String[][] photo) {
                List<Integer> list = new ArrayList<>();

                    for (int j = 0; j < photo.length; j++) {
                        int result = 0;
                        for (int k = 0; k < photo[j].length; k++) {
                            for (int l = 0; l < name.length; l++) {
                                if (photo[j][k].equals(name[l])) {
                                    result += yearning[l];
                                }
                            }
                        }
                        list.add(result);
                    }

                int[] result = new int[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    result[i] = list.get(i);
                }

                return result;
            }
        }
        Solution solution = new Solution();
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        System.out.println(solution.solution(name, yearning, photo)[0]);
    }
}

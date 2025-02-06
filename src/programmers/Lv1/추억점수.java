package programmers.Lv1;

import java.util.HashMap;

public class 추억점수 {
    public static void main(String[] args) {
        class Solution {
            public int[] solution(String[] name, int[] yearning, String[][] photo) {
/*                List<Integer> list = new ArrayList<>();

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
                }*/

                /* HashMap 이용 */
                int[] result = new int[photo.length];
                HashMap<String, Integer> map = new HashMap<>();

                for (int i = 0; i < name.length; i++) {
                    map.put(name[i],yearning[i]); // may,5
                }

                for (int i = 0; i < photo.length; i++) {
                    String[] persons = photo[i];
                    int score = 0;
                    for (int j = 0; j < persons.length; j++) {
                        if (map.containsKey(persons[j])) {
                            score += map.get(persons[j]);
                        }
                    }
                    result[i] = score;
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

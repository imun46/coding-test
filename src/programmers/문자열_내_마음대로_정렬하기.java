package programmers;

public class 문자열_내_마음대로_정렬하기 {
    public static void main(String[] args) {
        /*
        문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때,
        각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
        예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
        * */


        class Solution {
            public String[] solution(String[] strings, int n) {
                String[] answer = new String[strings.length];

                for (int i = 0; i < strings.length -1 ; i++) {
                    for (int j = 0; j < strings.length -1 ; j++) {
                        if(strings[j].charAt(n) > strings[j+1].charAt(n)) {

                            String temp = strings[j];
                            strings[j] = strings[j+1];
                            strings[j+1] = temp;

                        }else if(strings[j].charAt(n) == strings[j+1].charAt(n)){
                            if(strings[j].compareTo(strings[j+1]) > 0){
                                String temp = strings[j];
                                strings[j] = strings[j+1];
                                strings[j+1] = temp;
                            }
                        }
                    }
                }

                answer = strings;
                return answer;


                /*
                다른 사람 답안
                String[] answer = {};
                ArrayList<String> arr = new ArrayList<>();
                for (int i = 0; i < strings.length; i++) {
                    arr.add("" + strings[i].charAt(n) + strings[i]);
                }
                Collections.sort(arr);
                answer = new String[arr.size()];
                for (int i = 0; i < arr.size(); i++) {
                    answer[i] = arr.get(i).substring(1, arr.get(i).length());
                }
                return answer;
                 */
            }
        }
        Solution solution = new Solution();
        String[] strArray = new String[]{"sun", "bed", "car"};

        solution.solution(strArray, 1);
    }
}

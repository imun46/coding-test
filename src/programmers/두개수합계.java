package programmers;

import java.util.HashSet;

public class 두개수합계 {
	public static void main(String[] args) {
		/*
		 * 정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 
		 * 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 
		 * 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
		 *
		 * */
		
		class Solution {
		    public int[] solution() {
		        int[] answer = {2,1,3,4,1};
		        HashSet<Integer> set = new HashSet<>();
		        
		        for (int i = 0; i < answer.length-1; i++) {
					for (int j = i+1; j < answer.length; j++) {
						set.add(answer[i] + answer[j]);
					}
				}
		        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
		    }
		}
		
		
		
		Solution sol = new Solution();
		
		sol.solution();
	}
}

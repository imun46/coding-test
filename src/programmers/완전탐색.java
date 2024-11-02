package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class 완전탐색 {
/*
 * 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
 *  수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answerss가 주어졌을 때, 
가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 * 
 * */
	public static void main(String[] args) {
		class Solution {
		    public int[] solution() {
		        int[] answers = {1,1,1,1,1};
		        
		        int[] a = {1,2,3,4,5};
		        int[] b = {2,1,2,3,2,4,2,5};
		        int[] c = {3,3,1,1,2,2,4,4,5,5};
		        
		       List<Integer> score = new ArrayList<>();
		        
		        //a학생 비교
		        int count = 0;
		        for (int i = 0; i < answers.length; i++) {
		        		if(answers[i] == a[i%a.length]) {
		        			count++;
					}
				}
		        System.out.println(count);
		        score.add(count);
		        count = 0;
		        for (int i = 0; i < answers.length; i++) {
		        	if(answers[i] == b[i % b.length]) {
		        		count++;
		        	}
		        }
		        System.out.println(count);
		        score.add(count);
		        count = 0;
		        for (int i = 0; i < answers.length; i++) {
		        	if(answers[i] == c[i%c.length]) {
		        		count++;
		        	}
		        }
		        score.add(count);
		        System.out.println(count);
		        
		        
		        List<Integer> result = new ArrayList<>();
		        
		        for (int i = 0; i < score.size(); i++) {
	        		if(score.get(i) == Collections.max(score)) {
	        			result.add(i+1);
	        		}
		        }
		        
        		 return result.stream().mapToInt(Integer::intValue).toArray();
        		
		    }
		}
		
		Solution sol = new Solution();
		int[] array = sol.solution();
		
		System.out.println(Arrays.toString(array));
	}

}

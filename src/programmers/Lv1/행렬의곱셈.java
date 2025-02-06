package programmers.Lv1;

public class 행렬의곱셈 {
	public static void main(String[] args) {
		/*
		2차원 행렬 arr1과 arr2를 입력받아, arr1에 arr2를 곱한 결과를 반환하는 함수, solution을 완성해주세요.
		[[1, 4], [3, 2], [4, 1]]	[[3, 3], [3, 3]]
		*/
		class Solution {
		    public int[][] solution(int[][] arr1, int[][] arr2) {
		    	 arr1 = new int[][] {{1, 4}, {3, 2}, {4, 1}};
		    	 arr2 = new int[][] {{3,3},{3,3}};
		    	
		        int[][] answer = new int[arr1.length][arr2[0].length];
		        
		        for (int i = 0; i < answer.length-1; i++) {
		        	int result = 0;
		        	for (int j = 0; j < answer[0].length; j++) {
						 result += arr1[i][j]*arr2[i][j];
					}
		        	System.out.println(result);
		        	
				}
		        
		        
		        return answer;
		    }
		}
		
		Solution sol = new Solution();
		sol.solution(null, null);
		
	}
}

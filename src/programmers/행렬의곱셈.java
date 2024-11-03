package programmers;

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
		    	
		        int[][] answer = {};
		        
		        for (int i = 0; i < arr1[0].length; i++) {
		        	for (int j = 0; j < arr2[0].length; j++) {
						
					}
				}
		        
		        
		        return answer;
		    }
		}
		
		Solution sol = new Solution();
	}
}

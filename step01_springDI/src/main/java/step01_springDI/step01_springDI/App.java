package step01_springDI.step01_springDI;

/*
 * Hello world!
 *
 */
public class App { 
	
    public static void main( String[] args ){
    	    	
    	int[] stones = {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
    	int k = 3;
    	
    	Solution sl = new Solution();    	
    	int i = sl.solution(stones, k);
    	
    	System.out.println(i);
    	 
    }
}


class Solution {
    public int solution(int[] stones, int k) {
    	
    	int answer = 200000000;    	
    	
    	for(int i=0 ; i<= stones.length-k;) {
    		    		
    		int max = stones[i];
    		int index = 0; // 최대값의 인덱스를 체크
    		
    		for(int j=1 ; j<k ; j++) {
    			
    			if(stones[j+i] > max) {
    				
    				index = j+i;
    				max = stones[j+i];    				
    			}
    		}    			
    			if(index == 0 ) {
    				i++;
    			} else {
    				i = index + 1;
    			}    			
    			answer = Math.min(answer, max); 
    		}       	   
        return answer;
    }
}

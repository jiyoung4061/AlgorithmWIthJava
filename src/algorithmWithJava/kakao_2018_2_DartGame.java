package algorithmWithJava;

import java.util.Stack;
import java.util.StringTokenizer;

public class kakao_2018_2_DartGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String dartResult = "10S2D*3T";
			
			int answer = 0;
			
			
			
			for(int i = 0 ; i < result.length ; i++) {
				System.out.println(result[i]);
			}
			
			Stack<Integer> stack = new Stack<Integer>();
			
			
	}

//	if(res[i] >= '0' && res[i] <= '9') {
//		int a = Character.getNumericValue(res[i]);
//		stack.push(getResult(a, res[i+1]));
//	} 
	public static int getResult(int a, char b) {
		int result = 0;
		switch(b) {
		case 'S':
			result = a;
			break;
		case 'D':
			result = (int)Math.pow(a, 2);
			break;
		case 'T':
			result = (int)Math.pow(a, 3);
			break;
		}
		return result;
	}
	
	public static int getResultByOption(char a, Stack<Integer> stack) {
		int result = 0;
		int score = stack.pop();
		System.out.println("score"+score);
		switch(a) {
		case '*':
			result += score*2;
			if(stack.isEmpty()) {
				result += score*2;
			} else {
				result += stack.pop()*2;
			}
			System.out.println("result:"+result);
			break;
		case '#':
			result -= score;
			System.out.println("result:"+result);
			break;
		}
		
		return result;
	}
}

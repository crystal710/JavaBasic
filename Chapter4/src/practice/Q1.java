package practice;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		char operator = '+';
		int a = 10;
		int b = 5;
		int result = 0;
		
		if (operator == '+')			
			result = a+b;
		else if (operator == '-')
			result = a-b;
		else if (operator =='*')
			result = a*b;
		else if (operator == '/')
			result = a/b;
		else {
			System.out.println("연산자 오류입니다.");
			return;
		}
		System.out.println(result);
		
		int result2 = 0;
		switch(operator) {
		case '+' : result2 = a+b;
			break;
		case '-' : result2 = a-b;
			break;
		case '*' : result2 = a*b;
			break;
		case '/' : result2 = a/b;
			break;
		}
		System.out.println(result2);
	}

}

package oop;

public class oop4 {
	public static void main(String[] args) {
	//..
	printA("----"); // delimiter 안에 들어갈 문자열 입력.  
	//..			// 실행 결과 : ----
					//           A
					//			 A
	printB("****");
	//..			// 실행 결과 : ****
					//           B
					//			 B
}//main

private static void printA(String delimiter) { //delimiter = 구분자 라는 이름의 문자열 변수를 넣겠다
	System.out.println(delimiter); 		   //delimiter를 사용할 부분 즉 문자열 변수를 줄 부분
	System.out.println("A");
	System.out.println("A");
}  
private static void printB(String delimiter) { 
	System.out.println(delimiter); 
	System.out.println("B");	
	System.out.println("B");	
}
}//class



//여기서 더 나아가
/*	
	printA("----"); 
	printA("----"); 
	printB("----"); 
	printB("----"); 

	printA("****");
	printA("****");
	printB("****");
	printB("****");
	이런 과정이 엄청나게 반복된다고 가정하자 
	그럼 또 delimiter를 일일히 바꿔주어야 한다 oop5에서 계속
*/

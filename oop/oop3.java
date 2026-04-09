package oop;

public class oop3 {
	public static void main(String[] args) {
		//..
		printA();
		//..
		printB();
		//..
	}//main

	private static void printA() { 
		System.out.println("----"); 
		System.out.println("A");
		System.out.println("A");
	}  
	private static void printB() { 
		System.out.println("----"); // 어느 부분에서는 구분자를 *로 사용하고 싶으면 printA*라는 메소드를 또 만들어 줘야한다
		System.out.println("B");	// B를 출력하는 메소드도 추가했다고 가정하자.
		System.out.println("B");	// 그럼 printA- printA* printB- printB* 4개만 만들면 되지만,
									// 구분자가 늘어나거나 다른 출력문이 늘어난다면 만들어 줘야 하는 메소드의 양이 계속 증가한다.
	}
}//class

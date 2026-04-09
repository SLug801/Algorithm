package oop;

public class oop2 {
	public static void main(String[] args) {
		//..
		printA();
		//..
		printA();
		//..
	}//main

	private static void printA() { //반복되는 부분을 메소드로 만들면 간편하다.
		// 반복되는 부분을 드래그 -> Refactor -> Extract Method 를 하고, printA를 입력하면 자동으로 메소드를 만들어준다.
		System.out.println("----");
		System.out.println("A");
		System.out.println("A");
	}   //printA라는 것은 - sysout ---- A A 를 출력하는것. 이라고 정의하는셈
}//class

package oop;

public class oop5 {
	public static void main(String[] args) {	
		String s = "----"; //printA 메소드의 delimiter 자리에 들어갈 s 
		printA(s); 		   //인자 값이 바뀌면서 한번에 폭발적으로 바뀌는 장점.
		printA(s); 
		printA(s); 
		printA(s); 
		s="****"; // 이후로는 * 출력
		printB(s); 
		printB(s); 
		printB(s); 
		printB(s); 

	}//main

	private static void printA(String delimiter) { 
		System.out.println(delimiter); 		   
		System.out.println("A");
		System.out.println("A");
	}  
	private static void printB(String delimiter) { 
		System.out.println(delimiter);
		System.out.println("B");	
		System.out.println("B");	
		}
}//class



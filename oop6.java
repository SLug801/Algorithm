package oop;

public class oop6 {
	public static String delimiter; // class 전체에 공유하는 static 변수 
	public static void main(String[] args) {	
		delimiter="----"; // main 에서도 delimiter 사용 가능
		printA(); 		   
		printA(); 
		printA(); 
		printA(); 
		delimiter="****"; 
		printB(); 
		printB(); 
		printB(); 
		printB(); 

	}//main
	private static void printA() { 
		System.out.println(delimiter); // 메소드 안에서도 delimiter 사용 가능		   
		System.out.println("A");
		System.out.println("A");
	}  

	private static void printB() { 
		System.out.println(delimiter);
		System.out.println("B");	
		System.out.println("B");	
	}
}//class
package boj;
import java.util.Scanner;

public class boj3052 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int arr[] = new int[10]; //10개 배열 생성
	int count = 0; // count
 	
	for (int i=0; i<10; i++) {
		arr[i] = scan.nextInt()%42; //입력한 값을 42로 나눈 나머지를 바로 저장

		}
	for (int i=0; i<10; i++) {
		boolean x = true; // 비교를 위한 x 
		for(int j=0; j<i; j++) {
			if(arr[i] == arr[j]) { // i가 0일때 j[0]부터 j[i-1]까지 돌면서 비교,
			x = false;             // 두 수가 같으면 x false 
			break;
			}
		}
		if(x) count++;        //for문안의 조건을 만족하지 않아 그대로 나왔다면 
                          //x 값은 그대로 true, count 증가.
	}
		
		
	System.out.println(count);
	}//main
}//class

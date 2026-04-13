package boj;
import java.util.Scanner;
public class boj4153 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int side[] = new int[3]; // 삼각형의 세 변 
		int max = 0; // 최댓값
		while(true) { // 입력값이 0 0 0 일 때 까지 반복하기 위함 
			for (int i = 0; i < 3; i++) { 
				side[i] = scan.nextInt(); // 인덱스 값에 각 변의 길이 입력
				}//for
			if(side[0]==0 && side[1]==0 && side[2]==0) {break;} //모두다 0일 때 종료
			max = Math.max(side[0], Math.max(side[1], side[2])); // Math.max 이중으로 3개의 변 비교, max에 저장
			int sum = side[0]*side[0] + side[1]*side[1] + side[2]*side[2]; //직각 삼각형의 조건 = 최댓값^2 = 변1^2 + 변2^2
                                                                     //전부 제곱해서 전부 더해놓고
			if (sum - max*max == max*max) {System.out.println("right");}   //총합에서 max^2을 뺀 값이 max^2값과 같으면 직각 삼각형
			else if (sum - max*max !=max*max) {System.out.println("wrong");} 
		}//while
	}//main
}//class

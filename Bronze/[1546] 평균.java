import java.util.Scanner;

public class boj1546 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int max=0;               // 최댓값을 저장할 max
	double sum=0, average=0; // line18에서 저장될 값, 최종 출력값이 실수형
	int n = scan.nextInt();  
	int score[]= new int[n]; // n 만큼 배열생성
	
	for(int i=0; i<n; i++) {
		score[i] = scan.nextInt(); //n번째 배열까지 입력
		
		if(max<score[i]) max=score[i]; // 최댓값 구하기
	}//for
	for(int i=0; i<n; i++) {
		sum += score[i]*100.0/max; // score[i]*100/max를 하면 정수*정수/정수여서 sum에도 무조건 정수값이 들어감.
                               //  1. (double)score[i]/max*100;
                               //  2. score[i]*100.0/max;  -> 100.0으로 변환한다면 전체가 실수형으로 연산.
                               //                          -> 곱셈과 나눗셈이기 때문에 순서가 바뀌어도 상관 없음.
	}//for2
		average = sum/n;           // 재평균
		System.out.println(average);
	}//main
}//class

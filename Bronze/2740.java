package boj;
import java.util.Scanner;

public class boj2750 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int num[] = new int[n]; //n칸의 배열 생성
		
		for(int i=0; i<n; i++) {
			num[i]=scan.nextInt(); // 배열에 정수값 입력
			int j=i; //변수 j 생성
			
			while(j>0 && num[j]<num[j-1]) { // j가 0보다 크고, 현재 배열값과 한칸 왼쪽 배열값을 비교해서 현재값이 작다면
				int temp;          //임시 저장공간
				temp = num[j];     //오른쪽값->임시
				num[j] = num[j-1]; //왼쪽값->오른쪽으로
				num[j-1] = temp;   //임시(오른쪽값-> 왼쪽으로 -> 정렬 완료
				j--;               //j값 줄이기 ( i부터 왼쪽으로 계속 이동 ) ※삽입정렬
			}
		}//for i
		for(int k = 0; k<n; k++) {
			System.out.println(num[k]);
		}
	}//main
}//class

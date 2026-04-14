import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); // 사람수
		int arr[] = new int[6]; // 6개 사이즈
		for (int i = 0; i < 6; i++) {
			arr[i] = scan.nextInt();
		}// 입력 for
		int t = scan.nextInt(); // 티셔츠 묶음 개수
		int p = scan.nextInt(); // 펜 묶음 개수
		int count = 0; 
		
		for (int i = 0; i < 6 ; i++) {
           count += arr[i] / t;             //첫 번째 사이즈 부터 신청자 / 티셔츠 묶음개수 몫을 count에 대입
           if(arr[i] % t != 0) count += 1;  //나눈 나머지가 0이 아니면 +1
		}// count for                             ex) 7/5 2개가 남으니 +1
                                            //    5/5 -> skip
                                            //    3/5 -> skip
        
   
        
		
		System.out.println(count);
		System.out.printf("%d %d", n/p, n%p);

		
	}//main
}//class

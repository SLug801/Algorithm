	import java.util.Scanner;
	
	public class Main {
		public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	char[][] room = new char[n][n]; // n x n 의 방 생성
	int hor = 0; // 수평
	int ver = 0; // 수직
	int count = 0; // 예비 카운트
	int i,j;
	
	for(i=0; i<n; i++) { 
		String line = scan.next(); // 길이가 n 인 문자열 입력 
			for(j=0; j<n; j++) { 
				room[i][j] = line.charAt(j); // 입력받은 문자를 0번째줄 0번째 칸부터 차례로 등록
			}
		}//입력for
	for(i=0; i<n; i++) {
		count =0; // 카운트를 초기화
		for(j=0; j<n; j++) 
			if(room[i][j]=='.') count++; // 탐색하면서 .이 나오면 일단 카운트 증가
			else {if(count>=2) hor++; count=0;} // .이 아닌 벽을 만났을때 카운트가 2 이상이면 누울 수 있는 자리니 hor(수평) 자리 증가, 벽을 만났으니 0부터 다시시작(2를 만들면 또 수평을 증가 시키기 위함)
		if(count>=2) hor++; // 벽을 만나지 않고 길이가 끝났는데 2이상이면 누울 수 있는 자리니 증가
		} //가로계산
	for(i=0; i<n; i++) {
		count =0;
		for(j=0; j<n; j++)
			if(room[j][i]=='.') count++;
			else {if(count>=2) ver++; count=0;}
		if(count>=2) ver++;
		} // 동일한 방법으로 세로계산

	System.out.println(hor + " " + ver);// 출력
	}//main
}//class

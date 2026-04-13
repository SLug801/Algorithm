import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] arr = { 
			3,2,1,2,4,3,1,3,1,1,3,1,3,2,1,2,2,2,1,2,1,1,1,2,2,1
		}; // 획수를 배열로 미리 입력
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); // 첫번째 이름 길이
		int m = scan.nextInt(); // 두번째 이름 길이
		String A = scan.next(); // 첫번째 이름 
		String B = scan.next(); // 두번째 이름
		
		String result = ""; // 결과 문자열 초기화 
		int min; // 최소값 찾기 (A와 B를 교차로 나열하고 남는 이름은 뒤에 붙여야 하기 때문에)
		
		if (A.length() > B.length()) min = B.length(); //길이 비교후 더 작은 길이를 min에 입력
		else min = A.length();						   //Math.min도 사용 가능
		
		for (int i = 0; i < min; i++) { 
			result += A.charAt(i); // i를 min까지 증가시키며 result에 A[i]부터 
			result += B.charAt(i); // ABAB순서로 
		}
		
		if (min == A.length()) result += B.substring(min); //substring min -> 더 적은 길이번째 이후 글자를 result에 담음
		else result += A.substring(min);
		
		int[] numArr = new int[result.length()]; //각 문자에 대응되는 숫자를 저장할 배열
		
		for (int i = 0; i < result.length(); i++) { // 각문자를 숫자로 변환 -> 알파벳을 획수로
			numArr[i] = arr[result.charAt(i) - 'A']; //i-'A', arr에서 알파벳 획수 가져오기
		}
		
		while (numArr.length > 2) { // 배열의 길이가 2가 될때까지 반복
			int[] next = new int[numArr.length - 1]; // 다음단계를 저장할 배열 길이 1감소
			
			for (int i = 0; i < next.length; i++) { // 인접한 두 숫자를 더해서 새로운 배열 생성
				next[i] = (numArr[i] + numArr[i + 1]) % 10; // 앞 숫자 + 뒤 숫자 % 10 -> 10의자리수 탈락
			}
			
			numArr = next;
		}
		
		System.out.println(numArr[0]*10 + numArr[1] + "%");
	}
}

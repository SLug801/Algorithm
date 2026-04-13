import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        while (true) { // 0이 입력될 때까지 반복
            String s = scan.next();
            if (s.equals("0")) break; // 종료 조건 처리
            
            int n = s.length(); // 문자열 길이 n 구하기
            int i; //for문 밖에서 선언해서 for문을 거쳐도 생존
            
            // 양 끝에서부터 중앙으로 모이며 대칭 검사
            for (i = 0; i < n / 2; i++) {
                // 앞에서 i번째와 뒤에서 i번째(n-1-i)가 같은지 확인
                if (s.charAt(i) == s.charAt(n - 1 - i)) {
                    continue; // 일치하면 다음 글자 검사 진행
                } else {
                    break; // 다르면 중단 (팰린드롬 아님)
                }
            }
            // 문자열 길이의 중간값과 i가 일치하면 for문안의 if문을 만족했다는 뜻이니 팰린드롬수. yes출력
            if (i == n / 2) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}

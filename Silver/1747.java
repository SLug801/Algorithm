import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int j = scan.nextInt();

        while (true) {
            if (j == 1) { // 1은 소수가 아님으로 예외 처리
                j++;
                continue;
            }

            // 팰린드롬 검사
            String s = String.valueOf(j); // 입력받은 j를 문자열 s로 변환
            int len = s.length(); 문자열의 길이 구하기
            int i; // i의 값을 for문 밖에서도 사용하기 위함
            for (i = 0; i < len / 2; i++) { 
                if (s.charAt(i) != s.charAt(len - 1 - i)) { //양 끝에서부터 중앙으로 모이며 대칭 검사
                    break; // 검사후 대칭이 아니면 소수 검사 필요하지 않음
                }
            }

            // 팰린드롬이면 소수 검사
            if (i == len / 2) { // 문자열의 중간값과 i값이 일치하면 팰린드롬
                int k;
                for (k = 2; k * k <= j; k++) { // 제곱근과 같거나 작을때까지    
                    if (j % k == 0) break;  // 나누어 떨어지면 약수가 존재 
                }
  
                if (k * k > j) { // break되어 나온 수가 아닌 소수 확정 판별
                    System.out.println(j); // 출력
                    break;
                }
            }
            j++; //팰린드롬이 아니거나 소수가 아니면 다음 숫자
        }
    }
}

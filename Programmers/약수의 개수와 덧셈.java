class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            //제곱수는 약수 하나가 더 끼어있음
            //15 - 1 3 5 15 , 16 - 1 2 '4' 8 16
            if (i % Math.sqrt(i) == 0) { // sqrt - 제곱근 구하는 Math 메서드, ex) Math.sqrt(25) -> 5
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }
}

/* 초기 코드
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++){
            int count = 0;
            for (int j = 1; j <= i; j++){
                if (i%j == 0) count++;
            }
            if(count%2 == 0) answer += i;
            else answer -= i;
        }
        return answer;
    }
}
*/

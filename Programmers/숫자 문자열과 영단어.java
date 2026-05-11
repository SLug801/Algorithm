class Solution {
    public int solution(String s) {
        String num [] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}; // 배열에 단어 저장
        for( int i = 0; i < num.length; i++){
            s=s.replace(num[i], Integer.toString(i)); // i 증가시키며 단어들을 i 로바꿈. i는 정수형이므로 문자열로 바꿔줌
        }
        return Integer.parseInt(s); // 출력은 정수형으로 형 변환
    }
}

import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>(); //TreeSet 하면 add 하면서 정렬됨!
                                            //배열로 변환 안하고 리턴타입 바꿔도 정답처리 된다는데 코테에 도움은 안될것같아 검증은 안해봤음
        int idx=0; // 배열로 변환하면서 쓸 정답배열 idx
        for ( int i = 0; i < numbers.length; i ++){
            for ( int j = i+1; j < numbers.length; j++){
                set.add(numbers[i] + numbers[j]); // 2중 for문으로 전부 탐색하며 set에 값을 넣어줌
            }
        }
        int [] answer = new int[set.size()]; // set의 사이즈 만큼 배열 생성. set은 중복값을 알아서 제외시켜줌
        
        for (int num : set) {  // 향상 for문 사용해야함. set은 idx 값이 없기때문에 num에다가 하나씩 빼서 num에 넣고 answer[idx++] 하며 num을 넣어준다
            answer[idx++] = num; // 향상 for문은 while문 구조로 알아서 처음부터 끝까지 돌아준다 (if ~~ hasnext 같이)
        }
        Arrays.sort(answer); // 오름차순 정렬
        return answer;
    }
}

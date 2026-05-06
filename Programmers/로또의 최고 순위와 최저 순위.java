class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int [2];  //정답 출력할 배열 2칸
        int zcount = 0;              //0의 개수
        int rcount = 0;              //일치하는 개수
        for (int i = 0; i < 6; i++){
            if(lottos[i] == 0) zcount++;// 0의 개수 세기
        }  
        
        for (int i = 0; i < 6; i++){
            for ( int j = 0; j < 6; j++){
                if (lottos[i] == win_nums[j]) rcount++; // 일치하는 개수 세기
            }
        }
        int high = 0, low = 0;
        high = rcount + zcount; //high 값은 맞는 개수 + 0의 개수
        low = rcount;           //low 값은 0과 관련없이 맞는개수
        
        answer[0] = (high >= 2) ? 7 - high : 6; 
        answer[1] = (low >= 2) ? 7 - low : 6;
        
        return answer;
    }
}
/* // high가 2보다 클 경우 7-맞는개수가 등수
6개 맞으면 1등 -> 7-6 = 1
5개 맞으면 2등 -> 7-5 = 2
4개 맞으면 3등 -> 7-4 = 3
...
2개 맞으면 5등 -> 7-2 = 5
그 이하는 6등
*/

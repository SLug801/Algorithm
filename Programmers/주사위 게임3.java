import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int arr[] = {a,b,c,d}; //전달값을 배열에 삽입
        Arrays.sort(arr);      //배열을 오름차순으로 정렬
        
        if(arr[0]==arr[3]) return 1111*arr[0];                                    //정렬을 완료했으므로 처음 인덱스값과 끝 인덱스값이 같다면 배열의 모든 인덱스가 같은것
        else if(arr[0]==arr[2]) return (10*arr[0]+arr[3])*(10*arr[0]+arr[3]);     //앞 3개가 같을때 (0,1,2)
        else if(arr[1]==arr[3]) return (10*arr[1]+arr[0])*(10*arr[1]+arr[0]);     //뒤 3개가 같을때 (1,2,3)
        else if(arr[0]==arr[1]&&arr[2]==arr[3]) {                                 //같은값이 두개일때도 정렬을 완료했음으로 (0,1) (2,3)만 비교
            int p = arr[0]; 
            int q = arr[2];
            return (p + q) * Math.abs(p - q);                                     //큰 수에서 작은수의 차를 구하기위한 Math.abs
        }
         else if (arr[0] == arr[1]) {                                             //정렬을 완료했고, 앞의 조건문에서 걸러졌기 때문에 나머지 두자리는 다를 수 밖에 없음
            return arr[2] * arr[3];
        }
        else if (arr[1] == arr[2]) {
            return arr[0] * arr[3];
        }
        else if (arr[2] == arr[3]) {
            return arr[0] * arr[1];
        }
        else {
            return arr[0];                                                        //가장작은 수 출력
        }
    }
}

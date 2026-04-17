/*Array -> int [] arr = new int [3];
크기 고정, 기능 적음, 빠름

List -> List<Integer>list = new ArrayList<>();
크기 늘어남. 기능 많음, 느림

Generic -> Queue<int[]>  -> <>안의 타입을 정의. int 배열만 넣곘다.  
*/

Queue<int[]> q = new ArrayDeque<>();
//Queue 인터페이스. 안의 기능 즉 메소드는 offer 삽입, poll 배출 등.
//정수형 배열만 입력받음. 이름은 q로 지정.
//ArrayDeque - BFS 할때 최적, 양쪽에서 넣고 뺄 수 있는 Queue
q.offer(new int[]{i,j});
//배열 하나를 만들어서 i,j좌표값을 q라는 큐 안에 넣겠다.
//배열에 이름이 없는 이유는 한번쓰고 버릴 배열이라서.
//익명 객체 (anonymous object) 라고함
int[] ij = q.poll(); 
//큐의 맨 앞 값을 꺼냄
PrioityQueue<Integer>pq = new PriorityQueue<>();
//우선순위 큐, 큰값이나 작은값이 먼저 나오게 할 수 있음 즉, 정렬기능이 있음.
for(int n:num_list) 
//num_list 배열의 [0] 번째 인덱스 부터, 마지막 인덱스까지 정수형 n에 넣겠다
//for(int i=0; i<num_list.length; i++){
//int n = num_list[i];} 코드와 정확히 일치.
//사용 예시 sum += n; -> 배열의 0번째부터 마지막까지 더해라.



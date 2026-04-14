import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int arr[] = new int[8]; //배열 8칸 생성 (1~8까지)
	for(int i = 0; i < 8; i++) {  
		arr[i] = scan.nextInt();     
		}
	
	boolean asc = true; //asc 와 des 참으로 설정.
	boolean des = true;
	
	for(int i = 0; i < 7; i++) {
		if(arr[i]+1!=arr[i+1]) asc = false; // 1-8오름차순이라면 arr[i]+1 == arr[i+1] 이여야함. 아니라면 asc 거짓
		if(arr[i]-1!=arr[i+1]) des = false; // 8-1내림차순이라면 arr[i]-1 == arr[i+1] 이여야함. 아니라면 des 거짓
    // mixed의 경우 둘다 거짓으로 바뀜.
		}
	
	if(asc) System.out.println("ascending");
	else if(des) System.out.println("descending");
	else System.out.println("mixed"); // 출력
	}//main
}//class

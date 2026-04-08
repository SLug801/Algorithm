import java.util.Scanner;
    public class Main {
    	public static void main(String[] args) {
    		Scanner scan = new Scanner(System.in);
    		int[] arr = new int[3]; // 3개의 주사위 
    		int price;
    		for(int i=0; i<3; i++){
    			arr[i]=scan.nextInt();
    		}//for
    		if(arr[0]==arr[1] && arr[1]==arr[2]) // 3개가 다 같을때
    			price = 10000 + arr[0]*1000;
        else if (arr[0]==arr[1] || arr[0]==arr[2]) 
          price = 1000 + arr[0]*100;
     		else if (arr[1]==arr[2])
    			price = 1000 + arr[1]*100;
    		else {
    			int max = Math.max(arr[0],Math.max(arr[1],arr[2])); //Math.max -> 두수비교 메소드 2번사용
          //세개의 값을 한번에 비교, 최댓값 추출
    			price = max*100;
    		}//else
    		System.out.println(price);
    	}//main
    }//class

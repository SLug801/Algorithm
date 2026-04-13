package boj;
import java.util.Scanner;

public class boj2750 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0; // 카운트
		int newnum = n; //새로운 수

		//if(n==0) System.out.println("1"); 0 예외처리를 안하면 while문을 돌지 않아 0출력하는 현상
		//if(n!=0) {
		//while (newnum!=n) {
		do{	 // do while 로 무조건 한번은 실행되게 함. 
			newnum = (newnum%10*10) + ((newnum/10+newnum%10)%10);
        //ex)65 6+5=11 -> 51 5+1 ...
        //65%10*10 = [50]   | + | ((65/10) + (65%10))%10 =[1]
        //50+1 =51
        //newnem = 51
			count++;
    }while(newnum!=n); //do 
			
			
		System.out.println(count);
	}//main
}//class

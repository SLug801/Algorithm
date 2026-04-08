import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); // 입력받을 케이스 수
		int x, y; 
		for(int i=0; i<n; i++) {
		x= scan.nextInt();
		y= scan.nextInt();
		
		int sum=0;
		if (x==1) sum=5000000; //초기코드에는 (x<2) 로 설정했었는데, 이 경우 0도 sum=500만이 되어 예외처리를 위해 x==1로 조건변경
    else if (x==0||x>21) sum=0; //순위권이 아닐때의 예외값 0  
		else if (x>1&&x<4) sum=3000000;
		else if (x>3&&x<7) sum=2000000;
		else if (x>6&&x<11) sum=500000;
		else if (x>10&&x<16) sum=300000;
		else if (x>15&&x<22) sum=100000;
		
		
		if (y==1) sum+=5120000;
    else if (y==0||y>31) sum+=0;
		else if (y>1&&y<4) sum+=2560000;
		else if (y>3&&y<8) sum+=1280000;
		else if (y>7&&y<16) sum+=640000;
		else if (y>15&&y<32) sum+=320000;
    

		
		System.out.println(sum);
		}
	}
}

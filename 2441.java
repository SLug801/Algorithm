import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // n번 반복
    
            
        for(int i=0; i<n; i++){
                for(int j=0; j<i; j++){
                    System.out.print(" ");}//forj
                for(int k=0; k<n-i; k++){
                    System.out.print("*");}//fork
                    System.out.print("\n");
               }//fori
        }//main
}//class
//n=5일때 
//1. j - 0, i - 0, 공백 실행 안됨
//1. k - 0, 5-0까지(5) -> ***** -> enter
//2. j - 0, i - 1, 공백 실행 x 1
//2. k - 0, 5-1까지(4) -> **** -> enter
//3. j - 0, i - 2, 공백 실행 x 2
//3. k - 0, 5-2끼지(3) -> *** -> enter

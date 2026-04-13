package boj;
import java.util.Scanner;
import java.util.*;

public class boj2309 {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        
	        int a[] = new int[9];       //9명의 난쟁이
	        int sum = 0, target = 0;    
	        int i=0, j=0;              
	        for(i=0; i<9; i++) {      
	        	a[i] = scan.nextInt();    //배열에 입력
	        	sum += a[i];	            //총합
	        }

	        Arrays.sort(a);             //오름차순 정렬

	        target = sum-100;           //총합 - 100
	        int x=0, y=0;               //for문 break, 출력용
  
	        for(i=0; i<9; i++) {        // 9번 반복
	        	for(j=i+1; j<9; j++) {    // a[i] a[j] = 같은값 이니 j+1부터
	        		if(a[i]+a[j] == target) {  // target 값과 같으면 각각 저장
	        			x=i;
                y=i;
	        			break;
	        		}//if
	        	}//for j
	        	if (x!=0) break; // for문 탈출
	        }//for i 
	        for(int k=0; k<9; k++) { 
	        	if(k==x||k==y) continue; // 찾은 인덱스값과 같으면 건너뛰기 
	        	System.out.println(a[k]);
	        }//출력 반복문
	    }
	}

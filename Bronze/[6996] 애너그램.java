package boj;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class boj6996 {

    private static boolean solveAnagrams(String first, String second ) {
        
        String a[] = new String[first.length()];
        String b[] = new String[second.length()];
        
        for (int i = 0; i<first.length(); i++) {
        	a[i] = String.valueOf(first.charAt(i));
        	b[i] = String.valueOf(second.charAt(i));
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        return Arrays.equals(a, b);
        
            

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }
    }
}

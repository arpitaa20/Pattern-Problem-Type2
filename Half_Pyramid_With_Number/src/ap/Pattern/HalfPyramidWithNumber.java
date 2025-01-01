package ap.Pattern;

import java.util.Scanner;

public class HalfPyramidWithNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
//		outer loop --> for rows
		for(int i=1; i<=n; i++) {
//			inner loop --> for columns
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}

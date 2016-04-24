package Exercise.CreateFigure;

import java.util.Scanner;

public class Main1304 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int num =in.nextInt();
		
		
		for(int i=1;i<=num;i++){
			
			for(int k = 0;k<num;k++){
				
				System.out.printf("%d ", i+(k*num));
				
			}
			System.out.println("");
			
		}
		
		
		in.close();
		
		
	}

}

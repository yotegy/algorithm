package Exercise.CreateFigure;

import java.util.Scanner;

public class Main1856 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int height = in.nextInt();
		int width = in.nextInt();
		
		int number =1;
		
		for(int i = 0;i<height;i++){
			
			if(i%2 == 0){
				
				for(int k = 0;k<width;k++){
					
					System.out.printf("%d ", number++);
					
				}
				
			}else{
				
				number += width;
				int temp = number;
				for(int k = 0;k<width;k++){
					System.out.printf("%d ", --temp);
				}
				
				
			}
			
			
			System.out.println("");
		}
		
		
		in.close();
		
		
	}

}

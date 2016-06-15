package Exercise.CreateFigure;

import java.util.Scanner;

public class Main2046 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int type = in.nextInt();
		
		switch (type){
		case 1:
			show01(num);
			break;
		case 2:
			show02(num);
			break;
		case 3:
			show03(num);
			break;
		
		}
		
		
		in.close();
		

	}
	
	public static void show01(int num){
		
		for(int i=0;i<num;i++){
			
			for(int k=0;k<num;k++){
				System.out.printf("%d ", i+1);
			}
			System.out.println("");
		}
	}
	
	public static void show02(int num){
		
		for(int i=0;i<num;i++){
			
			if(i%2 == 0){
				
				for(int k=1;k<=num;k++){
					System.out.printf("%d ", k);
				}
				
			}else{
				
				for(int k=num;k>0;k--){
					System.out.printf("%d ", k);
				}
			}
			System.out.println("");
		}
	}

	public static void show03(int num){
		for(int i=0;i<num;i++){
			
			for(int k=1;k<=num;k++){
				System.out.printf("%d ", (i+1)*k);
			}
			System.out.println("");
		}
	}


}

package Basis.Repeat.Control2;

import java.util.Scanner;

public class Main549 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		int array = 1;
		int count = 0;
		int sum = 0;
		
		while(sum < num){
			
			count++;
			sum += array;
			
//			System.out.println(" c :"+count+" sum "+sum+" array "+array);
			array += 2;
			
		}
		
		in.close();
		
		System.out.printf("%d %d", count,sum);
		
	}

}

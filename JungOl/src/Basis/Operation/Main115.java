package Basis.Operation;

import java.util.Scanner;

public class Main115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.printf("�μ��� Ű�� ������ �Է� ");
				
		int min_height = in.nextInt();
		int min_weight = in.nextInt();
		
		System.out.printf("�⿵���� Ű�� ������ �Է� ");
		
	    int ky_height = in.nextInt();
	    int ky_weight = in.nextInt();
	    
	    int out = 0;
	    
	    if(min_height > ky_height && min_weight > ky_weight){
	    	out = 1;
	    }
		
		
		System.out.printf("%d",out);;
		
		
	}

}

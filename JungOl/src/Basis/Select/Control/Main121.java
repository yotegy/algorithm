package Basis.Select.Control;

import java.util.Scanner;

public class Main121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		
		if(a > 0 ){
			System.out.println("plus");
		}else if( a == 0){
			System.out.println("zero");
		}else{
			System.out.println("minus");
		}
		
		
	}

}

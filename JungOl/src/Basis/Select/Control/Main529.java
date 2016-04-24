package Basis.Select.Control;

import java.util.Scanner;

public class Main529 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int height = in.nextInt();
		int weight = in.nextInt();
		
		int metric = weight+100 - height;
		
	    System.out.println("비만수치는 "+metric+"입니다.");
	    if(metric > 0 ){
	    	System.out.println("당신은 비만이군요.");
	    }
		
		
		
	}

}

package Basis.Select.Control;

import java.util.Scanner;

public class Main531 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		float weight = in.nextFloat();
		
		if(weight <= 50.8f){
			System.out.println("플라이급");
		}else if(weight <= 61.23f){
			System.out.println("라이트급");
		}else if(weight <= 72.57f){
			System.out.println("미들급");
		}else if(weight <= 88.45f){
			System.out.println("크루저급");
		}else{
			System.out.println("헤비급");
		}
		
	}

}

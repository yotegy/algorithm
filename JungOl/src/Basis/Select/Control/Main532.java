package Basis.Select.Control;

import java.util.Scanner;

public class Main532 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String sex = in.next();
		int age = in.nextInt();
		
		if(sex.equals("M")){
			
			if(age >= 18){
				System.out.println("MAN");
			}else{
				System.out.println("BOY");
			}
			
		}else if(sex.equals("F")){
			
			if(age >= 18){
				System.out.println("WOMAN");
			}else{
				System.out.println("GIRL");
			}
			
		}else{
			System.out.println(" Wrong..."+sex+ " : "+age);
		}
	
		
	}

}

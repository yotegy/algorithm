package Basis.Debugging;

import java.util.Date;
import java.util.Scanner;

public class Main119 {

	public static void main(String[] args) {

	
		int a =0;
		Date d = new Date();
		
		
//		System.out.println(" yesr :"+d.getYear() +"  mon :"+d.getMonth() + " day :"+d.getDate());
		
		
		
		System.out.printf("%d",a);
		a = d.getYear();
		
		
		System.out.printf(" %d",a);
		a += d.getMonth();
		
		
		a += d.getDate();
		System.out.printf(" %d",a);
		
	}

}

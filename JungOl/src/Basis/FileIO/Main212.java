package Basis.FileIO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main212 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		float sum = 0.0f;
		float avg = 0.0f;

		ArrayList<Float> numlist = new ArrayList<Float>();
				
		for(int k =0;k<num;k++){
			
			sum = 0.0f;
			
			for(int i=0;i<3;i++){
				sum += in.nextFloat();
			}
			
			avg = sum/3.0f;
			avg = Math.round(avg*10)/10.0f;
			
			numlist.add(avg);
			
		}
		
		Collections.sort(numlist,Collections.reverseOrder());
		
		for(float a : numlist){
			System.out.println(a);
		}
		
	
		
		in.close();
		
	}

}

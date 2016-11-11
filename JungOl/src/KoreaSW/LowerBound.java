package KoreaSW;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LowerBound {

	public static int array[];
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int totalNum = Integer.parseInt(br.readLine());
		
		array = new int[totalNum];
		
		String temp[] = br.readLine().split(" ");
		
		for(int i=0;i<totalNum;i++){
			
			array[i] = Integer.parseInt(temp[i]);
			
		}
		
		int target = Integer.parseInt(br.readLine());
		
		
		
		int point = findPositionLB(target);
		
		System.out.println(point);
		
		br.close();
		
	}

	//  LowerBound
	private static int findPositionLB(int target) {
		
		
		
		return 0;
	}

}

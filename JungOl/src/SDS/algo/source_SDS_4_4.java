package SDS.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class source_SDS_4_4 {

	public static String array[];
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int pro = Integer.parseInt(br.readLine());
		
		for(int i=0;i<pro;i++){
			
			int num = Integer.parseInt(br.readLine());
			
			array = new String[num];
			
			for(int k=0;k<num;k++){
				
				array[k] = br.readLine();
				
			}
			
			Arrays.sort(array);
			
			if(find(num)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			
		}
		
	}

	private static boolean find(int num) {
		
		for(int i=0;i<(num-1);i++){
			
			for(int j = i+1;j<num;j++){
				
				if( array[i].charAt(0) == array[j].charAt(0)){
					
					if(array[j].indexOf(array[i]) == 0) {
						return false;
					}					
					
				}else{
					break;
				}
				
			}
			
			
		}
		
		return true;
	}


	

}

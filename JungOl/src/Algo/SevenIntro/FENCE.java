package Algo.SevenIntro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FENCE{

	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("./src/Algo/SevenIntro/fence.txt");
		FileInputStream fs = new FileInputStream(f);

		Scanner in = new Scanner(fs);
		
		int problem = in.nextInt();
		
		for(int num =0;num<problem;num++){
			
			
			int fence_num = in.nextInt();
			
			int fence[] = new int[fence_num];
			
			// Storing inputs into Array.
			for(int i =0;i<fence_num;i++){
				
				fence[i] = in.nextInt();
				
			}
			
			int ret = 0;
			int width = -1;
			int left = 0;
			int right = 0;
			
			for(int i = 0; i<fence_num ;i++){
				
				width = 0;
				right = 0;
				left =-1;				
				
				for(int k =i;k<fence_num;k++){
					
					if(fence[i] > fence[k] ){
						
						right = k;
						break;
					}
					
				}
				
				for(int k=i;k>=0;k--){
					
					if(fence[i] > fence[k]){
						
						left = k;
						break;
						
					}
					
				}
				width = fence[i]*(right - left-1);
				
				ret = Math.max(ret, width);
				
			}
			
			System.out.println(ret);
			
		}
		
		
		in.close();
		
	}

}

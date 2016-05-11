package Algo.SevenIntro;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class FENCE02{

	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("./src/Algo/SevenIntro/fence.txt");
		FileInputStream fs = new FileInputStream(f);

		Scanner in = new Scanner(fs);
		
		int problem = in.nextInt();
		
		for(int num =0;num<problem;num++){
			
			
			int fence_num = in.nextInt();
			
			int fence[] = new int[fence_num+1];
			
			// Storing inputs into Array.
			for(int i =0;i<fence_num;i++){
				
				fence[i] = in.nextInt();
				
			}
			fence[fence_num] = 0;
			
			// Start Algorithm
			
			int ret = 0;
			int width = 0;
			
			Stack<Integer> stack = new Stack<Integer>();
			
			int left[] = new int[fence_num];
			int right[] = new int[fence_num];
			
			for(int i = 0; i<fence_num ;i++){
				
				
				// last one
				if(fence[i] <= fence[i+1]){
					
					if(stack.isEmpty()){
						left[i] = -1;
						
					}else if(fence[i] == fence[(int)stack.peek()]){
						
						left[i] = left[(int)stack.peek()];
						
					}else{
						
						left[i] = (int) stack.peek();
						
					}
					
//					System.out.println(" "+i+" is going in stack  and left[i] is "+left[i] );
					
					stack.push(i);
					
				}else{
					
					right[i] = i+1;
					if(stack.isEmpty()) {
						left[i] = -1;
					}else if(fence[i] == fence[(int)stack.peek()]){
						
						left[i] = left[(int)stack.peek()];
						
					}else{
						
						left[i] = (int) stack.peek();
						
					}
					
					width = fence[i]*( right[i]-left[i] -1);
					ret = Math.max(ret, width);
					
//					System.out.println("noStack :: right[i] "+right[i]+" left[i] "+left[i]+" fence[i] "+fence[i]+" i "+i+" width "+width);
//					System.out.println(" Ret "+ret);
					
					while(!stack.isEmpty() && fence[stack.peek()] > fence[i+1]){
						
						int point = stack.pop();
						
						right[point] = i+1;
						
						width = fence[point]*(right[point]-left[point]-1);
						
						ret = Math.max(ret, width);
						
//						System.out.println("inStack :: right[point] "+right[point]+" left[point] "+left[point]+" fence[point] "+fence[point]+" i "+point+" width "+width);
//						System.out.println(" Ret "+ret);
					}
					
					
				}
				
			}
			
			System.out.println(ret);
			
		}
		
		
		in.close();
		
	}

}

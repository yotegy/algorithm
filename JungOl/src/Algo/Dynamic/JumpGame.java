package Algo.Dynamic;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class JumpGame {

	public static int[][] array;
	public static int[][] visited;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		/*  From File
		 
		
		File file = new File("./resource/FileInput_JumpGame.txt");
		FileInputStream fis = new FileInputStream(file);
		Scanner in = new Scanner(fis);
		*/
		Scanner in = new Scanner(System.in);
		
		int problem = in.nextInt();
		
		for(int number = 0;number <problem;number++){
			
//			System.out.println(" Start >>>>>> "+(number+1));
			
			int line = in.nextInt();
			
			array = new int[line][line];
			visited = new int[line][line];
			
			
			for(int x=0;x<line;x++){
				for(int y=0;y<line;y++){
					
					array[x][y] = in.nextInt();
					visited[x][y] = -1;
				}
			}
			
			// Finished inserting input data
			
			int x1 = 0;
			int y1 = 0;
			
			int  result = 0;
			
			result = findExit(x1,y1,line);
			
			if(result >= 1){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		
			
			
//			for(int x=0;x<line;x++){
//				for(int y=0;y<line;y++){
//					
//					System.out.printf("%d ", visited[x][y]);
//				}
//				System.out.println("");
//			}
			
		}
		
	}

	private static int findExit(int x1, int y1,int line) {
		
		int subresult = 0;
		
		if( x1 >=line || y1 >= line ){
			return 0;
		}else if(array[x1][y1] == 0){
			return 1;
		}
		
		int jump = array[x1][y1];
		
//		System.out.printf("%d %d : %d",x1,y1,array[x1][y1]);
		
//		System.out.println("");

		if(visited[x1][y1] != -1) return visited[x1][y1];
		
		if(findExit(x1+jump,y1,line)==1 || findExit(x1,y1+jump,line)==1){
			subresult = 1;
		}else{
			subresult = 0;
		}
		
		visited[x1][y1] = subresult;
		
		return subresult;
	}

}

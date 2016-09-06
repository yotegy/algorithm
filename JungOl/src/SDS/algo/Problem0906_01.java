package SDS.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem0906_01 {
	
	public static int family[];

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int pro = Integer.parseInt(br.readLine());
		
		for(int i = 1 ; i<=pro;i++){
			
			int member = Integer.parseInt(br.readLine());
			
			String tempArray[] = br.readLine().split(" ");
			int Aman = Integer.parseInt(tempArray[0]);
			int Bman = Integer.parseInt(tempArray[1]);
			
			int relation = Integer.parseInt(br.readLine());
			
			family = new int[member+1];
			
			// Initialize
			for(int k = 1;k<=relation;k++){
				family[k] = k;
			}
			
			// find daddy
			for(int k =0;k<relation;k++){
				
				tempArray = br.readLine().split(" ");
				
				family[Integer.parseInt(tempArray[1])] = Integer.parseInt(tempArray[0]);
				
			}
			
			int aline[] = new int[relation];
			
			Arrays.fill(aline, -1);
			
			int line = Aman;
			int position = 0;
			aline[position] = line;
			
			while(true){
				
				if(line == family[line]){
					
					break;
				}else{
					
					position++;
					aline[position] = family[line];
					line = family[line];
					
				}
				
			}
			
			System.out.println(" "+aline[0]+" "+aline[1]+" "+aline[2]);
			
			String bline = ""+Bman;
			line = Bman;
			
			while(true){
				
				if(line == family[line]){
					
					break;
				}else{
					
					bline = bline+family[line];
					line = family[line];
				}
				
			}
			
			System.out.println(bline);
			
			int result = -1;
			
			for(int t=0;t<=position;t++){
				
				System.out.println(" aline  "+aline[t]);
				
				int finalPosition =  bline.indexOf(""+aline[t]);
				System.out.println(" FinalPosition "+finalPosition);
				
				// Mapping
				if( finalPosition > -1 ){
					
					result = finalPosition + t;
					break;
				}
				
			}
			
			System.out.println("#"+i+" "+result);
			
		}
		
		
	}

}

package Basis.Array02;


public class Main165 {

	public static void main(String[] args) {
		
		int array[][] = new int[5][5];
		
		array[0][0] = array[0][2] = array[0][4] =1;
		
		for(int i=1;i<5;i++){
			for(int k=0;k<5;k++){
				
				if(k==0){
					
					array[i][k] = array[i-1][k+1];
					
				}else if(k==4){
					
					array[i][k] = array[i-1][k-1];
										
				}else{
					
					array[i][k] = array[i-1][k+1] + array[i-1][k-1];
					
				}
				
			}
		}
		
		for(int i=0;i<5;i++){
			for(int k=0;k<5;k++){
				
				System.out.printf("%d ", array[i][k]);
			}
			System.out.println();
		}
		
		
	}

}

package Basis.FileIO;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main628 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		ST628 st[] = new ST628[10];
		
		for(int k=0;k<10;k++){
			
			st[k] = new ST628();
			
			st[k].order = k;
			st[k].name = in.next();
			st[k].score = in.nextInt();
						
		}
		
		Arrays.sort(st,new ST618_sort_by_score_reverse());

		for(int k=0;k<10;k++){
			
			if( k != 0 && st[k-1].score == st[k].score  ){
				st[k].grade = st[k-1].grade;
			}else{
				st[k].grade = (k+1);
			}
			
		}
		
		Arrays.sort(st,new ST618_sort_by_origin());
		
	    System.out.printf("  이름 점수 등수\n");
	    
	    for(int k=0;k<10;k++){
	    	
	    	System.out.printf("%3s %4d %4d\n", st[k].name,st[k].score,st[k].grade);
	    	
	    	
	    }
		
		
		in.close();

	}

}

class ST628{
	
	public int order;
	public String name;
	public int score;
	public int grade;
	
	
}

class ST618_sort_by_origin implements Comparator<ST628>{

	@Override
	public int compare(ST628 o1, ST628 o2) {
		
		boolean comp = o1.order <= o2.order;
		
		if(comp){
			return -1;
		}else{
			return 1;
		}
		
	}
	
}

class ST618_sort_by_score_reverse implements Comparator<ST628>{

	@Override
	public int compare(ST628 o1, ST628 o2) {

		boolean comp = o1.score <= o2.score;
		
		if(comp) {
			return 1;
		}else {
			return -1;
		}
	}
	
}
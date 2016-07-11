package Algo.Dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class PI {

	public static char list[];
	public static int cache[] = new int[10000];
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		String aaa = in.nextLine();
		
		for(int i=0;i<num;i++){
			
			int result = 0;
			Arrays.fill(cache, -1);
			
			list = in.nextLine().trim().toCharArray();
			
			result = mem(0);
			
//			for(int k=0;k<list.length;k++){
//				System.out.println("["+k+"]"+cache[k]);
//			}
			
			System.out.println(result);
			
		}
		
		in.close();
		
	}

	private static int mem(int i) {
		
		
		int mid = 987654321;
		
		if(cache[i] != -1) {
//			System.out.println( " return cache["+i+"] "+cache[i]);
			return cache[i];
		}
		
		int remain = list.length -i;
		
		if (remain < 3 ){
			cache[i] = mid;
//			System.out.println( " return cache["+i+"] "+cache[i]);
			
			return mid;
			
		}else if(remain < 6){
			
			mid = cal(i,remain);
			cache[i] = mid;
			return mid;
			
		}

		mid = Math.min( Math.min( cal(i,3) + mem(i+3), cal(i,4) + mem(i+4) ) , cal(i,5) + mem(i+5));
				
		
//		System.out.println("cache["+i+"], remain : "+mid);
		cache[i] = mid;
		return mid;
	}

	private static int cal(int start, int plus) {
		
//		System.out.println(" start "+start+"  , plus "+plus+"   : "+list[start]+"  list.length : "+list.length);
		
		if( (start + plus) > list.length){
			return 777;
		}
		
		// level 1
		int num=1;
		for(int i=1;i<plus;i++){
			
			if(list[start] != list[start+i] ){
				break;
			}
			num++;
			
		}
		if(num == plus) return 1;
		
		
		// level 2
		num = 1;
		int temp = list[start]- list[start+1];
		for(int i = 0;i<(plus-1);i++){
			if( Math.abs(temp) != 1) break;
			if( (list[start+i]- list[start+i+1]) != temp){
				break;
			}
			num++;
		}
		if(num == plus) return 2;
		
		// level 3,4
		num = 1;
		int gap = Math.abs(list[start]-list[start+1]);
		for(int i = 1;i<plus;i++){
			
			if(Math.abs(list[start+i-1]-list[start+i]) != gap){
				break;
			}
			num++;
		}
		
		if(num == plus){
			
			if( Math.abs(list[start] - list[start+plus-1]) == gap*(plus-1) ){
				return 5;
				
			}else if(list[start] == list[start+2]){
				
				if(plus == 3){
					return 4;
				}else if(plus == 4){
					if(list[start+1] == list[start+3]) return 4;
				}else if(plus==5){
					if(list[start] == list[start+4] && list[start+1] == list[start+3]) return 4;
				}
				
			}
			
		}
		
		return 10;
	}

}

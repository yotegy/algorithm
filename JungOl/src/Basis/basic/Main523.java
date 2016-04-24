package Basis.basic;

import java.util.Scanner;

public class Main523 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int first = in.nextInt();
		int second = in.nextInt();
		
		int out;
		
		if(first >  second){
			out = 1;
		} else {
			out = 0;
		}			
				
		System.out.printf("%d > %d --- %d\n",first,second,out);
		
		if(first <  second){
			out = 1;
		} else {
			out = 0;
		}			
				
		System.out.printf("%d < %d --- %d\n",first,second,out);
		
		if(first >=  second){
			out = 1;
		} else {
			out = 0;
		}			
				
		System.out.printf("%d >= %d --- %d\n",first,second,out);
		
		if(first <=  second){
			out = 1;
		} else {
			out = 0;
		}			
				
		System.out.printf("%d <= %d --- %d",first,second,out);
		
		
	}

}


/*
     ¼·¾¾ = (È­¾¾-32) x 0.55 È­¾¾ = (¼·¾¾ x 1.8) + 32ÀÌ´Ù.
     ¼·¾¾ 21.6¡Æ¸¦ È­¾¾·Î È­¾¾ 110.3¡Æ¸¦ ¼·¾¾·Î º¯È¯ÇÏ¿© ´ÙÀ½ Çü½Ä¿¡ ¸ÂÃß¾î ¼Ò¼ö µÑÂ° ÀÚ¸®¿¡¼­ ¹Ý¿Ã¸²ÇÏ¿© ¼Ò¼ö Ã¹Â°ÀÚ¸®±îÁö Ãâ·ÂÇÏ½Ã¿À.
     
     ¼·¾¾  21.6µµ´Â È­¾¾ 70.9µµÀÌ´Ù.
     È­¾¾ 110.3µµ´Â ¼·¾¾ 43.1µµÀÌ´Ù.
*/

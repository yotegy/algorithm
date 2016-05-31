package Algo.SevenIntro;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FANMEETING {

	public static void main(String[] args) throws IOException {

//		FileInputStream fs = new FileInputStream("src/Algo/SevenIntro/FANMEETING.txt");
//
//		Scanner in = new Scanner(fs);
		 Scanner in = new Scanner(System.in);

		int problem = in.nextInt();

		for (int num = 0; num < problem; num++) {

			char actor[] = (in.next()).toCharArray();
			char fan[] = (in.next()).toCharArray();

			int atotal = actor.length;
			int ftotal = fan.length;
			int ctotal = atotal + ftotal -1;
			
			int anum[] = new int[atotal];
			int fnum[] = new int[ftotal];
			int c[] = new int[ctotal];

			int fcheck = 0;
			
			for (int i = 0; i < atotal; i++) {

				if (actor[atotal - 1 - i] == 'F') {
					anum[i] = 0;
				} else {
					fcheck++;
					anum[i] = 1;
				}

			}
			
			int count = 0;
			
			if(fcheck == 0){
				count = ftotal - atotal+1;
			}else{
	
				// for(int i=0;i<anum.length;i++) System.out.printf("%d ", anum[i]);
				// System.out.println();
	
				for (int i = 0; i < ftotal; i++) {
					if (fan[i] == 'F') {
						fnum[i] = 0;
					} else {
						fnum[i] = 1;
					}
				}
	
				// for(int i=0;i<fnum.length;i++) System.out.printf("%d ", fnum[i]);
				// System.out.println();
	
				for (int i = 0; i < atotal; i++) {
	
					if (anum[i] == 1) {
						for (int k = 0; k < ftotal; k++) {
							if(fnum[k] == 1) c[i + k] += anum[i] * fnum[k];
						}
					}
	
				}
	
				
	
				for (int i = (atotal - 1); i < (ctotal - (atotal - 1)); i++) {
					if (c[i] == 0) {
						count++;
					}
				}
			}

			System.out.println(count);

		}

		in.close();
//		fs.close();

	}

}

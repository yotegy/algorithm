package Basis.structure;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main199 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int count = in.nextInt();

		ST199 st[] = new ST199[count];

		for (int k = 0; k < count; k++) {

			st[k] = new ST199();
			st[k].name = in.next();
			st[k].score[0] = in.nextInt();
			st[k].score[1] = in.nextInt();
			st[k].score[2] = in.nextInt();

			st[k].total = st[k].score[0] + st[k].score[1] + st[k].score[2];

		}

		Arrays.sort(st,new STsort());
		
		for(int k=0;k<count;k++){
			
			System.out.printf("%s %d %d %d %d\n", st[k].name, st[k].score[0],st[k].score[1], st[k].score[2], st[k].total);
			
		}
		
		in.close();

	}

}

class STsort implements Comparator<ST199> {

	@Override
	public int compare(ST199 o1, ST199 o2) {

		if (o1.total < o2.total) {
			return 1;
		} else if (o1.total > o2.total) {
			return -1;
		} else {
			return 0;
		}

	}

}

class ST199 {

	public String name;
	int score[] = new int[3];
	int total;

}

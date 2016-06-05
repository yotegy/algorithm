package Basis.structure;

import java.util.Scanner;

public class Main615 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		StudentClass stu[] = new StudentClass[2];
		
		stu[0] = new StudentClass();
		stu[0].name = in.next();
		stu[0].korean = in.nextInt();
		stu[0].english = in.nextInt();
		
		stu[1] = new StudentClass();
		stu[1].name = in.next();
		stu[1].korean = in.nextInt();
		stu[1].english = in.nextInt();
		
		int avg_kor = 0;
		int avg_eng = 0;
		
		for(int k=0;k<stu.length;k++){
			avg_kor += stu[k].korean;
			avg_eng += stu[k].english;
			System.out.printf("%s %d %d\n",stu[k].name,stu[k].korean,stu[k].english);
		}
		
		System.out.printf("평균 %d %d\n", avg_kor/2,avg_eng/2);
		
		in.close();
		
	}

}


class Student{
	
	public String name;
	public int korean;
	public int english;
	
	
}
package Basis.structure;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main618 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		Student618 st[] = new Student618[5];
		
		for(int k =0;k<5;k++){
			
			st[k] = new Student618();
			st[k].name = in.next();
			st[k].height = in.nextInt();
			st[k].weight = in.nextFloat();
			
		}
		
		System.out.println("이름순");
		Arrays.sort(st, new StudentNameSort());
		
		prout(st);
		System.out.println();
		System.out.println("몸무게순");
		Arrays.sort(st,new StudentWeightSort());
		
		prout(st);
		
		in.close();

	}
	
	public static void prout(Student618[] st){
		
		for(int k =0;k<st.length;k++){
			
			System.out.printf("%s %d %.1f\n", st[k].name,st[k].height,st[k].weight );
			
		}
		
	}

}


class Student618 {
	
	public String name;
	public int height;
	public float weight;
	

}

class StudentNameSort implements Comparator<Student618> {
	
	@Override
	public int compare(Student618 o1, Student618 o2) {
		// TODO Auto-generated method stub
		
		int compare_result = o1.name.compareToIgnoreCase(o2.name);
		
		if( compare_result > 0 ){
			return 1;
		}else if( compare_result < 0 ){
			return -1;
		}else{
			return 0;
		}
		
	}


}

class StudentWeightSort implements Comparator<Student618> {
	
	@Override
	public int compare(Student618 o1, Student618 o2) {
		// TODO Auto-generated method stub
		
		boolean compa = o1.weight < o2.weight;
		
		if( compa ){
			return 1;
		}else if( !compa ){
			return -1;
		}else{
			return 0;
		}
		
	}

}
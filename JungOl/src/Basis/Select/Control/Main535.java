package Basis.Select.Control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main535 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		List<Integer> array = new ArrayList();
		
		for(int i=0;i<3;i++) array.add(in.nextInt());
		
		Collections.sort(array,new intCompare());
		
		System.out.println(array.get(0));
		
		
	}
	
	

}

class intCompare implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		
		if(o1 > o2 ){
			return 1;
		}else{
		    return -1;
		}
	}
}

package Basis.structure;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main196 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		Man196 man[] = new Man196[3];
		
		for(int k=0;k<3;k++){
			
			man[k] = new Man196(in.next(),in.next(),in.next());
			
		}
		
		Arrays.sort(man,new ManSort());
		
		System.out.println("이름 : "+man[0].name);
		System.out.println("전화번호 : "+man[0].tel);
		System.out.println("주소 : "+man[0].addr);
		
		in.close();
		
	}

}

class Man196{
	
	public String name;
	public String tel;
	public String addr;
	
	public Man196(String a,String b,String c){
		this.name =a;
		this.tel =b;
		this.addr =c;
	}
	
}

class ManSort implements Comparator<Man196>{

	@Override
	public int compare(Man196 o1, Man196 o2) {
		// TODO Auto-generated method stub
		
		int comp = o1.name.compareTo(o2.name);
		
		if(comp < 0 ){
			return -1;
		}else if(comp > 0){
			return 1;
		}else{
			return 0;
		}
		
	}
	
}
package Basis.Repeat.Control;

import java.util.Scanner;

public class Main134 {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int even = 0;   // ¦��
		int odd = 0;    // Ȧ��
		
		int num = 0;
		
		for(int i =0;i<10;i++){
			
			num = in.nextInt();
			
			if(num%2 == 0){
				even++;
			}else{
				odd++;
			}
			
		}
		
		System.out.printf("¦�� : %d��\n", even);
		System.out.printf("Ȧ�� : %d��",odd);


	}
}

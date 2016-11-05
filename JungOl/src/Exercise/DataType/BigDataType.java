package Exercise.DataType;

import java.math.BigDecimal;

public class BigDataType {

	public static void main(String[] args) {
		
		//testBig01();
		
		testBig02();

	}

	private static void testBig02() {
		
		// start time
		long start_time = System.currentTimeMillis();
		
		BigDecimal ad_array[][] = new BigDecimal[1001][1001];
		long mid_time = System.currentTimeMillis();
		
		System.out.println("경과 시간: " + (mid_time - start_time) + " ms");
		
		for(int i=0;i<1001;i++){
			
			for(int j=0;j<1001;j++){
				
				ad_array[i][j] = new BigDecimal("0");
				
			}
			
		}
		
		

		// main program source code

		// end time
		long end_time = System.currentTimeMillis();

		// compute elapsed time and send to console
		System.out.println("경과 시간: " + (end_time - start_time) + " ms");

		
		
	}

	private static void testBig01() {
		
		BigDecimal a = new BigDecimal("-121212121212121212");
		BigDecimal b = new BigDecimal("212121212121212121");
		
		BigDecimal c = a.add(b);
		
		System.out.println(c);
		
		c = b.subtract(a);
		
		System.out.println(c);
		
		c = a.multiply(b);
		
		System.out.println(c);

		System.out.println(a.abs());
		
		System.out.println(b.divide(a));
		
		System.out.println(a.movePointLeft(2));
		System.out.println(b.movePointLeft(2));
		
		System.out.println(a.ZERO);
		
	}

}

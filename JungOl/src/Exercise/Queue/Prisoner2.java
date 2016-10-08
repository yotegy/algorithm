package Exercise.Queue;

public class Prisoner2 implements Comparable<Prisoner2>{

	public String name;
	public int value;
	
	public Prisoner2(String n, int v){
		this.name = n;
		this.value = v;
	}
	
	
	@Override
	public int compareTo(Prisoner2 target) {
		
		if(this.value > target.value){
			return 1;  // ASC
		}else{
			return -1; 
		}
		
	}
	
	
	
	
}
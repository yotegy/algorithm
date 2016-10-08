package Exercise.Queue;

public class Prisoner implements Comparable<Prisoner> {

	String name;
	int value;
	
	public Prisoner(String name, int value){
		super();
		this.name = name;
		this.value = value;
	}
	
	@Override
	public int compareTo(Prisoner target) {

		if(this.value < target.value){
			return 1;
		}else{
			return -1;
		}
		
	}

}

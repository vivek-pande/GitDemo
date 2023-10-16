package inheritence;

public class ps2 extends Ps3 {
	int a;
	
	public ps2(int a) {
		super(a);// super class constructor invoked
		this.a=a;
	}
	
	public int increment() {
		a=a+1;
		return a;
	}
	public int decrement() {
		a=a-1;
		return a;
	}

}

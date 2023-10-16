package inheritence;

import org.testng.annotations.Test;

public class Ps1 extends ps {

	@Test
	public void testrun() {
		System.out.println("hi");
		System.out.println("heelo");
		parent();
		System.out.println("hi");
		System.out.println("heelo");
		System.out.println("heelo");
		System.out.println("heelo");
		System.out.println("heelo");
		System.out.println("heelo");
		System.out.println("heelo");
	}

	@Test
	public void constructor() {
		ps2 ps2 = new ps2(3);
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		
		System.out.println(ps2.multiplyThree());
	}

}

package inheritence;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ps {

	
	public void parent() {
		System.out.println("hi iam from parent class");
		
	}
	@BeforeMethod
	public void before() {
		System.out.println("i am from before method");
	}
	
	
}

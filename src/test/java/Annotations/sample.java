package Annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sample {

	
	@Test(dataProvider = "Sample")
	public void dataDriving(String greet,String get,int id) {
		System.out.println(greet+" "+get+" "+id);
	}
	
	@DataProvider(name="Sample")
	public Object[][] dataDrive() {
		Object[][] a = {{"Hello","Hi",123},{"Hi","Hello",1}};
		return a;
	}
	
}

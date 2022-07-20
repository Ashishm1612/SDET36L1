package mavenExample.practice;

import org.testng.annotations.Test;

public class mavenExampleTest4 {
	public void simple() {
		String BROWSER 	=System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println("browser------>" +BROWSER);
		System.out.println("url------>" +URL);
		
	}

	
	@Test
	public void mavenTest1() {
	System.out.println("test 1");
		
	}
	@Test
	public void mavenTest2() {
		System.out.println("test2 ");
		System.out.println("test run");
	}
	@Test
	public void mavenTest3() {
		System.out.println("test3 ");
		System.out.println("test3 ");}
		@Test
		public void mavenTest4() {
			System.out.println("test3 ");
			System.out.println("test3 ");

		

	}

}

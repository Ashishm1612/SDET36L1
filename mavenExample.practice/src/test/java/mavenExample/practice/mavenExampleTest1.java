package mavenExample.practice;

import org.testng.annotations.Test;

public class mavenExampleTest1 {

	
	@Test
	public void mavenTest1() {
	String BROWSER 	=System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println("browser------>" +BROWSER);
		System.out.println("url------>" +URL);
		System.out.println("test1 ");
		System.out.println("test run 1");
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

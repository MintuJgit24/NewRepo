package testNGPackage;

import org.testng.annotations.Test;

public class NewTestNG {
  @Test(priority = 1)
  public void display() {
	  System.out.println("hello method 1");//only methods having @Test will execute
	  //to set priority give (priority = 1) with @Test
  }
  @Test(priority = 2)
  public void read() {
	  System.out.println("hello method 2");
  }
  @Test(priority = 3)
  public void print() {
	  System.out.println("hello method 3");//execution take place in alphabetical order of the method
  }
}
//TestNG provide report index.html inside test-output folder, right click open with browser

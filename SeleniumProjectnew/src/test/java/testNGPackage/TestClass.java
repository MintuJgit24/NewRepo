package testNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestClass {
  @Test
  public void print() {
	  System.out.println("print method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");//this method run before any method
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");//this method run after any other method
  }
  @Test
  public void display() {
	  System.out.println("display method");
  }

}

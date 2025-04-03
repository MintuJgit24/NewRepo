package browserInitialisationPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
    public void idLocator() {
    	//locating message field of input form from obsqura site
    	WebElement messsageField=driver.findElement(By.id("single-input-field"));
    	WebElement messageField2=driver.findElement(By.id("button-one"));
    	WebElement messageField3=driver.findElement(By.id("button-two"));
		
	}
    
    public void classLocator() {
    	WebElement classField=driver.findElement(By.className("header-top"));
    	WebElement classField2=driver.findElement(By.className("card-body"));
    	WebElement classField3=driver.findElement(By.className("copyright"));
    	
    }
    
    public void nameLocator() {
    	WebElement nameField=driver.findElement(By.name("description"));
    	WebElement nameField2=driver.findElement(By.name("keywords"));
    	WebElement nameField3=driver.findElement(By.name("author"));
    	
    }
   
    // href="check-box-demo.php"
    
    public void linktextLocator() {
    	WebElement linkTextField=driver.findElement(By.linkText("check-box-demo.php"));
    	WebElement linkTextField2=driver.findElement(By.linkText("simple-form-demo.php"));
    	WebElement linkTextField3=driver.findElement(By.linkText("radio-button-demo.php"));
    }
    
    //radio-button-demo.php
    //to take partial link text if it is lengthy
    public void partialLinktextLocator() {
    	WebElement partialLinkTextField=driver.findElement(By.partialLinkText("radio"));
    	WebElement partialLinkTextField2=driver.findElement(By.partialLinkText("index"));
    	WebElement partialLinkTextField3=driver.findElement(By.partialLinkText("select"));
    }
    
    public void cssSelectorLocator() {
    	//4 combintions
    	//tag#id
    	WebElement cssSelectorField=driver.findElement(By.cssSelector("input#single-input-field"));
    	
    	//tag.class
    	WebElement cssSelectorField2=driver.findElement(By.cssSelector("div.card-body"));
    	
    	//tag[attributeype=attributevalue]
    	WebElement cssSelectorField3=driver.findElement(By.cssSelector("input[id=single-input-field]"));
    	
        //tag.class[attributetype=attributevalue]
    	WebElement cssSelectorField4=driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));

    }
    
   
    
    public void xpathLocator() {
    	
    	//Absolute XPath
    	//lengthy code, so mostly not used, not safe
    //  /html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input
    	WebElement xpathField=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/input"));
    	
    	//Relative XPath
    	// its syntax is:  //tagname[@attributetype='attributevalue']
    	// e.g             //input[@id='single-input-field']
    	WebElement xpathField2=driver.findElement(By.xpath("//input[@id='single-input-field']"));
    	WebElement xpathField3=driver.findElement(By.xpath("//button[@id='button-one']"));
    	WebElement xpathField4=driver.findElement(By.xpath("//button[@id='button-two']"));
    	WebElement xpathField5=driver.findElement(By.xpath("//a[@href='check-box-demo.php']"));
    	
    	//Dynamic XPath 
    	//methods are contains and text
    	//contains method syntax:  //tagname[contains(@attributetype,'value')]
    	//can give partial attribute value also
    	WebElement xpathField6=driver.findElement(By.xpath("//input[contains(@id,'single-input')]"));
    	WebElement xpathField7=driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
    	
    	//   //tagname[text()='value']
    	
    	WebElement xpathField8=driver.findElement(By.xpath("//button[text()='Show Message']"));
    	WebElement xpathField9=driver.findElement(By.xpath("//button[text()='Get Total']"));
    	WebElement xpathField10=driver.findElement(By.xpath("//a[text()='Simple Form Demo']"));
    	
    	
    }

}

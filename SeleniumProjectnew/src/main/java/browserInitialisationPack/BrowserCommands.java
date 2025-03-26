package browserInitialisationPack;

public class BrowserCommands extends Base {

	public void browserCommands() {
		String title=driver.getTitle();//returntype method
		System.out.println("title= "+ title);
		
		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String pageSource=driver.getPageSource();
		System.out.println(pageSource);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands brw=new BrowserCommands();
		brw.intilialiseBrowser();
		brw.browserCommands();
		brw.closeAndQuit();

	}

}

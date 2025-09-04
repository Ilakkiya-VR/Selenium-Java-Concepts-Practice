package WebDriver_AR;

public class BrowserTest {
	static WebDriver driver;
	public static void main(String[] args) {
		String browser="chrome";
		switch(browser) {
		case"chrome":
		{driver=new Chrome();
		break;
		 }
		case"firefox":
		{driver=new Firebox();
		break;
		 }
		default:
			System.out.println("Incorrect Browser");
			break;
	}
     driver.get("https://www.amazon.com/");
     String title=driver.getTitle();
     System.out.println(title);
     driver.findElement("search");
     driver.sendKeys("search", "Phone");
     driver.clickElement("search");
     driver.quit();
     
}
}
package WebDriver_AR;

public class Chrome implements WebDriver {
	
	public void launchBrowser() {System.out.println("Launch Chrome Browser");
	
	}

	@Override
	public void get(String url) {
		System.out.println("launch URL"+ url);
		
	}

	@Override
	public String getTitle() {
		return "My Title";
	}

	@Override
	public void findElement(String e) {
		System.out.println("Find the Element"+e);
		
	}

	@Override
	public void clickElement(String e) {
		System.out.println("Click the Element"+e);
	}

	@Override
	public void sendKeys(String e, String value) {
		System.out.println("Element"+e+"Value=="+e);
		
	}

	@Override
	public void quit() {
		System.out.println("Close Browser");
		
	}

}

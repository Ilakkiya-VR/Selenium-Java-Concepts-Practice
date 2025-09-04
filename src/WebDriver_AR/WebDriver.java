package WebDriver_AR;

public interface WebDriver {
	public void get(String url);
	public String getTitle();
	public void findElement(String e);
	public void clickElement(String e);
	public void sendKeys(String e, String value);
	public void quit();


}

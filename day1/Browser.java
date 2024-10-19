package week1.day1;

public class Browser {
	
	
	public void launchBrowser(String browserName)
	{
		
	System.out.println("Browser" + browserName + " launched successfully");
	}
	public void loadUrl()
	{
		
	System.out.println("Application url loaded successfully");
	}
	
	public static void main(String[] args) {
		
		Browser invoke = new Browser();
		invoke.launchBrowser("Edge");
		invoke.loadUrl();
		
	}
}
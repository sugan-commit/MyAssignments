package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
		}

}

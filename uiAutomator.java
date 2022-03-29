
public class uiAutomator {

	public static void main(String[] args) {
		
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		driver.findElementByAndroidUIAutomator();
		driver.findElementByAndroidUIAutomator();


	}

}


public class preferancePage extends lanchApp{

	
		public static void main(String[] args) throws MalformedURLException {
			AndroidDriver<AndroidElement>  driver = capabilities();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
			driver.findElement(By.id("android:id/checkbox")).click();
			driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
			driver.findElement(By.id("android:id/edit")).sendKeys("test2");
			driver.findElements(By.className("android.widget.Button")).get(2).click();

	}

}

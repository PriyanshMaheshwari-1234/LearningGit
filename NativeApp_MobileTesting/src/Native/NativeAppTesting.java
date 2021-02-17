package Native;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
//import org.openqa.selenium.interactions.internal.TouchAction;
import org.testng.annotations.Test;
import static io.appium.java_client.touch.offset.ElementOption.element;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;




public class NativeAppTesting extends Capability {

	//public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver;
		
		@BeforeTest
		public void bt() throws MalformedURLException {
			driver= capability1();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		@Test(enabled=false)
		public void test1() throws MalformedURLException, InterruptedException {
		//public static void main()
		//driver= capability1();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByAccessibilityId("Preference").click();
		driver.findElementByAccessibilityId("3. Preference dependencies").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByAndroidUIAutomator("UiSelector().text(\"WiFi settings\")").click();
		driver.findElementById("android:id/edit").sendKeys("Priyansh");
		
		//WebElement cancel = driver.findElementByClassName("android.widget.Button").get(0);
		WebElement cancel = driver.findElements(By.className("android.widget.Button")).get(0);
		cancel.click();
		
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		System.out.println("peeche dekhoo");
		Thread.sleep(3000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.findElementByAccessibilityId("Views").click();
		//Thread.sleep(2000);
		//System.out.println(driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)").getSize());
		WebElement tap = driver.findElementByAccessibilityId("Expandable Lists");
		 TouchAction tch = new TouchAction(driver);
		 tch.tap(tapOptions().withElement(element(tap))).perform();
		
		  //t.tap(tapOptions().withElement(element(tap))).perform();
		
		 
		 driver.findElementByAccessibilityId("1. Custom Adapter").click();
		 //WebElement lp= driver.findElementByAndroidUIAutomator(using)
		 
		 WebElement lp= driver.findElement(MobileBy.AndroidUIAutomator("text(\"People Names\")"));
		 
		 tch.longPress(longPressOptions().withElement(element(lp)).withDuration(ofSeconds(30))).release().perform();
		 
		 
		 WebElement menu = driver.findElements(By.className("android.widget.TextView")).get(1);
	        System.out.println(menu.getText());


		}
		
		
		@Test
		public void test2() {
			driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Views\")")).click();
			
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))").click();
		}
		
		//driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Views\")")).c
		
	}

//}

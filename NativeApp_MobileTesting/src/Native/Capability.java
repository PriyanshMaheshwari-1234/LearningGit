package Native;

//import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capability {
	
	//C:\\Users\\PriyanshMaheshwari\\Appium_MobileTesting\\NativeApp_MobileTesting\\

	public static AndroidDriver<AndroidElement>  capability1() throws MalformedURLException {
		
		//File fs = new File("src\\Native\\ApiDemos-debug.apk");
		DesiredCapabilities cap1= new DesiredCapabilities();
		cap1.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel");
		cap1.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap1.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
		//cap1.setCapability(AndroidMobileCapabilityType.BROWSER_NAME, value);
		//cap1.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		cap1.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis");
		cap1.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
		
		AndroidDriver<AndroidElement> driver1=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap1);
		
		return driver1;
	}

}

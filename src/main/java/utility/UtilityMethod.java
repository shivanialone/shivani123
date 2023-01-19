package utility;

	import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import Base.TestBase;

	public  class UtilityMethod extends TestBase{
		
		public static void SelectClass(WebElement ele , String Option)
		{
			Select s = new Select(ele);
			s.selectByVisibleText(Option);
		}
		
		public static void screenshot(String name) throws Exception  
		{
			File sou = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\sanjivani\\eclipse-workspace\\New Eclipse Workspace\\FrameWorkProject\\ScreenshotFrmwrk\\"+name+".jpg");
			FileUtils.copyFile(sou, des);
			
		}

	
		}
	

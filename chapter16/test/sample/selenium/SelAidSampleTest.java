package sample.selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.junit.Assert.*;

import com.path_not_tested.selaid.FormHelper;
import com.path_not_tested.selaid.SelectHelper;

/**
 * SelAid 使得可以很方便的使用 Selenium 2.0 WebDriver 来测试 Web 应用程序，
 * 助手类提供丰富的关于 WebDriver 的 WebElement 的抽象层。
 * 使用 SelAid 来编写 Web 测试程序使得测试更加简单、可读和可维护。
 */
public class SelAidSampleTest {
	WebDriver driver = null;

	@Before
	public void init() {
	    driver = new HtmlUnitDriver();
	}
	@Test
	public void test(){
		
		/**
		WebElement element = driver.findElement(By.id("colors"));
		SelectHelper helper = new SelectHelper(element);
		assertTrue(helper.isMultiSelect());
		assertTrue(helper.isSelected("yellow"));
		assertFalse(helper.isSelected("red"));
		assertFalse(helper.isSelected("fuchsia")); // doesn't exist
		assertArrayEquals(new String[] { "Yellow", "Green" }, helper
				.getSelectedText());
		**/
		
		driver.get("http://www.oschina.net/home/login");
		WebElement element = driver.findElement(By.id("frm_login"));
		FormHelper form = new FormHelper(element);
		assertNotNull(form);
	    
	}

}

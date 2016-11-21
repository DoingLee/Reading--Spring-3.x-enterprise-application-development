package sample.selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class SeleniumSampleTest {
	
	WebDriver driver = null;

	@Before
	public void init() {
	    driver = new HtmlUnitDriver();
	}
	
	@Test
	public void testFormPost(){
		//完全装载页面后将控制返回给测试脚本
		//注意：当页面又很多AJAX调用时，该接口无法确认页面是否完全装载，这是需要使用"waits"
		//navigate().to()和get()功能完全一样。
		driver.get("http://www.google.com"); 
		
		//浏览器的前进和后退
		//driver.navigate().forward();
		//driver.navigate().back();

		
		//（XPATH返回第一个匹配到的元素，如果没有匹配到，抛出NoSuchElementException）
		//element = driver.findElement(By.xpath( "//input[@id=’passwd-id’]" ));
		WebElement element = driver.findElement(By.name("q"));  
		
		//任何页面元素都可以调用sendKeys，
		//例如可以测试一些快捷方式键，键盘的每次输入都是附加在文本串的后面
		//element.clear(); 清除文本域内容
		element.sendKeys("Cheese!");     
	    
		
		//1. driver.findElement(By.id( "submit" )).click();
		//2. element.submit(); 要求element必须在表单中，否则抛出NoSuchElementException
		element.submit();       
		
		// Check the title of the page         
		//System.out.println("Page title is: " + driver.getTitle());
		
		
		/**
		//Cookies（必须首先在目标url域上）
		driver.get( "http://www.example.com" );
		Cookie cookie = new Cookie( "key" , "value" );
		driver.manage().addCookie(cookie);
		
		Set<Cookie> allCookies = driver.manage().getCookies();
		for (Cookie loadedCookie : allCookies) {
		    System.out.println(String.format( "%s -> %s" , loadedCookie.getName(), loadedCookie.getValue()));
		}
		**/


		

	}
	
	public void testWindowAndFrame(){
		//1 .在命名的窗口之间移动：switchTo
		//（可以通过js或者打开窗口的链接获取窗口名称）
		driver.switchTo().window( "windowName" ); 
		//2. 也可通过窗口句柄切换：
		for (String handle : driver.getWindowHandles()) {
		driver.switchTo().window(handle);
		}
		
		//3. frame之间切换或者切换到iframe：
		driver.switchTo().frame( "frameName" );
		//通过索引访问subframe：
		//（frameName的第一个subframe的明价child的frame）
		driver.switchTo().frame( "frameName.0.child" ); 
	}
	
	@Test
	public void testLogin() {
		driver.get("http://www.iteye.com/login");
		driver.findElement(By.id("user_name")).sendKeys("jeast");
		driver.findElement(By.id("password")).sendKeys("mjulkx2004");
		driver.findElement(By.id("button")).click();
		System.out.println("Page title is: " + driver.getTitle()); 	
		System.out.println("Page title is: " + driver.getPageSource()); 	
		//driver.findElement(By.linkText("My Matches")).click();
		//driver.findElement(By.linkText("New")).click();
		/*try {
			while (true) {
				try {
					driver.findElement(By.linkText("View Match Details"))
							.click();
				} catch (Exception e) {
					e.printStackTrace();
				}
				try {
					driver.findElement(By.linkText("Request my photo")).click();
				} catch (Exception e) {

				}
				driver.findElement(By.linkText("Send her a Message")).click();
				driver.findElement(By.name("chooseQuestionsButton.x")).click();
				// Send Questions
				driver.findElement(By.linkText("Return to My Matches")).click();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		driver.quit();

	}
		 
	
}

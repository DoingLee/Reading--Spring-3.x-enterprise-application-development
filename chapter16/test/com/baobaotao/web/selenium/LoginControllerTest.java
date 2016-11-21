package com.baobaotao.web.selenium;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.opera.core.systems.OperaDriver;

public class LoginControllerTest {
	//声明WebDriver
	WebDriver driver = null;
	
	@Before
	public void init() {
	    driver = new HtmlUnitDriver(); //IE
	}
	@Test
	public void loginCheck(){
		//完全装载页面后将控制返回给测试脚本
		//navigate().to()和get()功能完全一样。
		driver.get("http://localhost/chapter16/index.html"); 

		//（XPATH返回第一个匹配到的元素，如果没有匹配到，抛出NoSuchElementException）
		//element = driver.findElement(By.xpath( "//input[@id=’xxx’]" ));
		WebElement userName = driver.findElement(By.name("userName"));  
		WebElement password = driver.findElement(By.name("password"));
		
		//任何页面元素都可以调用sendKeys，
		userName.sendKeys("tom");     
		password.sendKeys("1234");  
		
		//提交表单
		driver.findElement(By.id( "loginBtn" )).click();
		//driver.findElement(By.id( "submit" )).submit(); 要求element必须在表单中，否则抛出NoSuchElementException

		//验证返回的主页面 main.jsp
		assertThat(driver.getTitle(), equalTo("宝宝淘论坛"));
		assertThat(driver.getPageSource(), containsString("tom"));
		WebElement body  = driver.findElement(By.xpath( "//body" ));
		assertThat(body.getText(), containsString("tom,欢迎您进入宝宝淘论坛"));
	}
	
}

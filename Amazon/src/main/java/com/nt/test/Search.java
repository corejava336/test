package com.nt.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Search {
	public static void main(String[] args) {
		WebDriver web = new ChromeDriver();
		web.manage().window().maximize();
		web.get("https://www.amazon.in/");
		WebDriverWait wait = new WebDriverWait(web, Duration.ofSeconds(40));
		web.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple iPhone 15 (128 GB) - Green" + Keys.ENTER);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a/h2/span[text()='Apple iPhone 15 (128 GB) - Green'][1]"))).click();
	}
}

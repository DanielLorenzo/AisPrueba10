package es.codeurjc.ais.tictactoe;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prueba {
	protected WebDriver driver;
	 @BeforeAll
	 public static void setupClass() {
		 WebDriverManager.chromedriver().setup();
		 WebApp.start();
	 }
	
	@AfterAll
	public static void teardownClass() {
		WebApp.stop();
	}
		
	 @BeforeEach
	 public void setupTest() {
		 driver = new ChromeDriver();
	 }
	 @AfterEach
	 public void teardown() {
		 if (driver != null) {
		 driver.quit();
		 }
	 }
	 @Test
	 public void test() {
		 driver.get("http://www.google.es");
	 }

}

package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		String exePath = "./driver/chromedriver"; //especificar la ruta del ChromeDriver
		System.setProperty("webdriver.chrome.driver", exePath); //Agregar propiedad de sistema con ruta del chromedriver
		WebDriver driver = new ChromeDriver();//Objeto del WebDriver
		driver.get("https://www.google.com");

	}

}

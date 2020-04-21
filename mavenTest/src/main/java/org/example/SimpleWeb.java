package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWeb {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3cschool.cn/");
        System.out.println("Home page title:" + driver.getTitle());

        WebElement element = driver.findElement(By.name("w"));
        element.sendKeys("Spring");
        element.submit();

        driver.quit();
    }
}

package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumJunit1 {
    public String seleniumWebJunit(){
        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3cschool.cn/");
        String tilte = "" + driver.getTitle();
        driver.quit();
        return tilte;
    }
}

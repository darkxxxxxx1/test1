package org.example;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class seleniumJunit1Test {

    WebDriver driver;
    static seleniumJunit1 sj;
    @BeforeClass
    public static void beforeClassTest(){
        sj = new seleniumJunit1();
    }
    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.w3cschool.cn/");
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test
    public void seleniumWebJunit() {
        String s = driver.getTitle();
        assertEquals(s,sj.seleniumWebJunit());
    }
    @AfterClass
    public static void testAfterClass(){
        sj = null;
    }
}
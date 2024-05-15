package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 //input text , number , password , textarea
//radio , checkbox
//dropdown
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        System.out.println( "Hello World!" );

        WebDriver driver = new ChromeDriver( );

        driver.get("http://www.google.com");

        WebElement textArea = driver.findElement(By.name("q"));

        textArea.sendKeys("demoqa.com");
        textArea.sendKeys(Keys.ENTER);

        WebElement lab = driver.findElement(By.tagName("https://demoqa.com/"));

        lab.click();

        WebElement label = driver.findElement(By.name("z9PoV"));
        label.click();

        WebElement label1 = driver.findElement(By.name("Elements"));
        label1.click();

    }
}

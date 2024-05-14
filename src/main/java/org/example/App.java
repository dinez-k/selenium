package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {

        System.out.println( "Hello World!" );

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");
        WebElement textArea = driver.findElement(By.name("q"));

        //input text , number , password , textarea
        //radio , checkbox
        //dropdown

        //changes

        // Input text into the textarea
        textArea.sendKeys("selenium.dev");

        textArea.sendKeys(Keys.ENTER);



    }
}

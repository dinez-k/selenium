package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

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

        driver.get("https://demoqa.com");

        WebElement homeBody = driver.findElement(By.className("home-body"));
        List<WebElement> h5Elements = homeBody.findElements(By.tagName("h5"));
        for (WebElement h5 : h5Elements) {
            System.out.println(h5.getText());
        }

//       List<WebElement> cards = driver.findElements(By.cssSelector(".card.mt-4.top-card"));
        WebElement firstCard = driver.findElement(By.cssSelector(".card.mt-4.top-card"));

        // Scroll the element into view using JavaScript
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", firstCard);

        // Click the element
        firstCard.click();

//        if (!cards.isEmpty()) {
//            WebElement firstCard = cards.get(0);
//            firstCard.click();
//        } else {
//            System.out.println("No elements found with the specified class name.");
//        }

//        WebElement textArea = driver.findElement(By.name("q"));

        //input text , number , password , textarea
        //radio , checkbox
        //dropdown

        //changes

        // Input text into the textarea
//        textArea.sendKeys("https://demoqa.com/");



//        textArea.sendKeys(Keys.ENTER);

        WebElement lab = driver.findElement(By.tagName("https://demoqa.com/"));

        lab.click();

        WebElement label = driver.findElement(By.name("z9PoV"));
        label.click();

        WebElement label1 = driver.findElement(By.name("Elements"));
        label1.click();

    }
}

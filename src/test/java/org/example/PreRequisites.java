package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PreRequisites {
    static WebDriver driver ;
    public void openAndNavigate(){

        WebDriverManager.chromiumdriver().setup();
        driver=  new ChromeDriver();


        driver.manage().window().maximize();

        driver.get("https://airmalta.com/en");

    }

    public void closeBrowser(){
        driver.quit();

    }
}

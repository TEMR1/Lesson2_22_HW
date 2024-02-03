package com.temr1.Lesson2_3_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int maxCounter = 5;

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/search?q=%D0%BF%D0%BE%D0%B3%D0%BE%D0%B4%D0%B0&sca_esv=5c40852b81bce253&sxsrf=ACQVn08tbv5w06PQp8UyKTcn6I0mB5KJ2g%3A1706986394147&ei=mou-ZYjLCPHJwPAPr6KqsA8&udm=&ved=0ahUKEwiIgKPt64-EAxXxJBAIHS-RCvYQ4dUDCBA&uact=5&oq=%D0%BF%D0%BE%D0%B3%D0%BE%D0%B4%D0%B0&gs_lp=Egxnd3Mtd2l6LXNlcnAiDNC_0L7Qs9C-0LTQsDIKECMYgAQYigUYJzILEAAYgAQYsQMYgwEyDhAAGIAEGLEDGIMBGMkDMggQABiABBjLATILEAAYgAQYsQMYgwEyCxAAGIAEGLEDGIMBMggQABiABBjLATIFEAAYgAQyBRAAGIAEMgUQABiABEjoDVDCBVj5CnABeAGQAQCYAXagAfICqgEDMy4xuAEDyAEA-AEBwgIKEAAYRxjWBBiwA8ICDRAAGIAEGIoFGEMYsAPiAwQYACBBiAYBkAYJ&sclient=gws-wiz-serp");

        List<WebElement> links = driver.findElements(By.cssSelector(".LC20lb.MBeuO.DKV0Md"));

        System.out.println("Перших 5 посилань на погоду: ");
        System.out.println(" ");

        if (links.size() > maxCounter){
            for (int i = links.size() - 1; i > maxCounter - 1; i--) {
                links.remove(i);
            }
        }

        for(WebElement needElement : links){
            System.out.println(needElement.getText());
        }
    }
}
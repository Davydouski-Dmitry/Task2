package ui_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest{


    //Test case 1 (обязательный)
    @Test
    public void checkTestCase1(){
        //1.Перейти на главную страницу
        driver.get("https://store.steampowered.com");
        driver.manage().window().maximize();

        //2.Кликнуть на кнопку ABOUT
        driver.findElement(By.xpath("//a[@href=\"https://store.steampowered.com/about/?snr=1_4_4__global-header\"] ")).click();

        //3.Сравнить числа игроков
        WebElement element = driver.findElement(By.xpath("//div[@class='online_stats']"));
        System.out.println(element.getText());

        //4.Перейти на страницу магазина
        driver.findElement(By.xpath("//a[@href=\"https://store.steampowered.com/?snr=1_14_4__global-header\"] ")).click();
    }
}

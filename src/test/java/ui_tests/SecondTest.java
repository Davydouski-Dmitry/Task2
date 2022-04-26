package ui_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SecondTest extends BaseTest {


    //Test case 2
    @Test
    public void checkTestCase2() {

        //Браузер должен запускаться в режиме инкогнито (задаётся через опции драйвера)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");


        WebDriver driver2 = new ChromeDriver(options);
        //1.Перейти на главную страницу
        driver2.get("https://store.steampowered.com");
        driver2.manage().window().maximize();

        //2.Навести курсор на “Новое и примечательное” в меню страницы.Используя явные ожидания, дождаться появления popup меню.
        //В появившемся меню кликнуть пункт “Лидеры продаж

        WebElement element1 = (new WebDriverWait(driver2, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id=\"noteworthy_tab\"]"))));
        element1.click();


        WebElement searchBtn = driver2.findElement(By.xpath("//a[@href=\"https://store.steampowered.com/search/?filter=topsellers&snr=1_7_7_7000_12\"]"));
        Actions actionProvider = new Actions(driver2);
        actionProvider.moveToElement(searchBtn).build().perform();


        driver2.findElement(By.xpath("//a[@href=\"https://store.steampowered.com/search/?filter=topsellers&snr=1_7_7_7000_12\"]")).click();


        //3.В правом меню, в блоке “Операционная система” выбрать чекбокс “SteamOS + Linux”
        driver2.findElement(By.xpath("//div[@class='tab_filter_control_row']//*[@class='tab_filter_control_checkbox']")).click();


        //4.В правом меню, в блоке “Количество игроков” выбрать чекбокс “Кооператив (LAN)”
    }
}
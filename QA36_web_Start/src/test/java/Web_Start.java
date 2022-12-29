import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Web_Start {
    WebDriver wd;

    @Test
    public void startTrello() {
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com/");
        wd.manage().window().maximize();
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();

        wd.close();
        wd.quit();
    }
    @Test
     public void Trello1(){
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com/");
        wd.manage().window().maximize();
    }
    @Test
     public void Trello2(){
    WebElement el1 = wd.findElement(By.tagName("div"));
    WebElement el2 = wd.findElement(By.tagName("a"));

    WebElement el3 = wd.findElement(By.id("user"));
    WebElement el4 = wd.findElement(By.id("login-form"));
    WebElement el5 = wd.findElement(By.className("show-when-password hidden"));
    WebElement el6 = wd.findElement(By.linkText("Log in"));

    //css
    WebElement el1c = wd.findElement(By.cssSelector("#user")); //id
    WebElement el2c = wd.findElement(By.cssSelector(".username-readonly")); //class
    WebElement el3c = wd.findElement(By.cssSelector(".m2N684FcksCyfT");
    WebElement el4c = wd.findElement(By.cssSelector("[data-testid='header-member-menu-button']")); //complex attribute

    //xPath
    WebElement el1x = wd.findElement(By.xpath("//*[@id='user']"));
    WebElement el2x = wd.findElement(By.xpath("//*[@class='username-readonly']"));
    WebElement el3x = wd.findElement(By.xpath("//*[data-testid='header-member-menu-button']"));


    //log in
    WebElement log1 = wd.findElement(By.cssSelector("[href='/login']"));
    WebElement log2 = wd.findElement(By.cssSelector("#user"));
    WebElement log3 = wd.findElement(By.cssSelector("#login"));
    WebElement log4 = wd.findElement(By.cssSelector("#password"));
    WebElement log5 = wd.findElement(By.cssSelector("#login-submit"));

    WebElement log6 = wd.findElement(By.cssSelector("."))

    //xPath log in
    WebElement el4x = wd.findElement(By.xpath("//*[@href='/login']"));
    WebElement el5x = wd.findElement(By.xpath("//*[@id='user']"));
    WebElement el6x = wd.findElement(By.xpath("//*[@id ='login']"));
    WebElement el7x = wd.findElement(By.xpath("//*[@id ='password']"));
    WebElement el8x = wd.findElement(By.xpath("//*[@id = 'login-submit']"));

    //log out css


    //elements with one word css
    WebElement log11 = wd.findElement(By.cssSelector("[aria-label='Trello']"));
    WebElement log12 = wd.findElement(By.cssSelector("[aria-label $='llo']")); //ends
    WebElement log13 = wd.findElement(By.cssSelector("[aria-label ^='Tr']")); //starts
    WebElement log14 = wd.findElement(By.cssSelector("[aria-label *='rel']")); //contains

    //elements with one word xPath
    WebElement logx1 = wd.findElement (By.xpath("//*[@aria-label='Trello']"));
    WebElement logx2 = wd.findElement (By.xpath("//*[contains(@aria-label, 'rel')]")); //contains
    WebElement logx3 = wd.findElement(By.xpath("//*[starts-with(@aria-label,'Tr')]")); //starts
    WebElement logx4 = wd.findElement(By.xpath("//*"));

}
}
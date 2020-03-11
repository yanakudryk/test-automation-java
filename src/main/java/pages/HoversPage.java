package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private WebDriver driver;
    private By figures= By.className("figure");
    private By figureCaption = By.className("figcaption");

    public HoversPage(WebDriver driver){
        this.driver = driver;
    }

    public FigureCaption hoverOverFigure(int index){
        WebElement figure = driver.findElements(figures).get(index - 1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
        return new FigureCaption(figure.findElement(figureCaption));
    }

    public class FigureCaption{
        private WebElement figureCaption;
        private By name = By.tagName("h5");
        private By link = By.tagName("a");

        public FigureCaption(WebElement figureCaption){
            this.figureCaption = figureCaption;
        }

        public boolean isDisplayed(){
            return figureCaption.isDisplayed();
        }

        public String getName(){
            return figureCaption.findElement(name).getText();
        }

        public String getLink(){
            return figureCaption.findElement(link).getAttribute("href");
        }

        public String getLinkText(){
            return figureCaption.findElement(link).getText();
        }
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class InfiniteScrollPage {
    private WebDriver driver;
    private By paragraphText = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     *
     * @param index is one based
     */
    public void scrollToParagraph(int index){
        String script = "window.scroll(0, document.body.scrollHeight);";
        while (getNumberOfParagraphs() < index) {
            ((JavascriptExecutor) driver).executeScript(script);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private int getNumberOfParagraphs(){
        return driver.findElements(paragraphText).size();
    }
}

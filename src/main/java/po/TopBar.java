package po;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
public class TopBar extends AbstractPO{
    Logger LOGGER = LogManager.getLogger(TopBar.class);
    @FindBy(name = "search")
    public WebElement searchInput;

    @FindBy(xpath = "/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/div/form/button")
    public WebElement searchButton;

    @FindBy(xpath = "/html/body/app-root/div/div/rz-category/div/main/rz-catalog/div/rz-catalog-settings/div/rz-sort/select")
    public WebElement chooseDropdown;
    @FindBy(xpath = "/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/ul/li[7]/rz-cart/button")
    public WebElement buttonBucket;

    public void clickOnChooseDropdownExpensive(){
        LOGGER.info("Select class for dropdown and select an item with value - 2: expensive");

        Select select = new Select(chooseDropdown);
        select.selectByValue("2: expensive");
    }
    public void clickButtonBucket(){
        LOGGER.info("Click on bucket button");
        try {
            TimeUnit.SECONDS.sleep(1);
            buttonBucket.click();
        }catch (InterruptedException e) {
            LOGGER.error(e);
            throw new RuntimeException(e);
        }
    }
    public void fillSearchInput(String message){
        LOGGER.info("Fill search input with massage - " + message);
        searchInput.sendKeys(message);
    }

    public void clickSearchButton(){
        LOGGER.info("Click on search button");
        searchButton.click();
    }
}

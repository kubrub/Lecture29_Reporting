package po;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class SideFilters extends AbstractPO{
    Logger LOGGER = LogManager.getLogger(SideFilters.class);
    ///html/body/app-root/div/div/rz-category/div/main/rz-catalog/div/div/aside/rz-filter-stack/div[2]/div/rz-scrollbar/div/div[1]/div/div/rz-filter-section-autocomplete/ul[1]/li[5]/a
    @FindBy(xpath = "/html/body/app-root/div/div/rz-category/div/main/rz-catalog/div/div/aside/rz-filter-stack/div[2]/div/rz-scrollbar/div/div[1]/div/div/rz-filter-section-autocomplete/ul[1]/li[5]")
    //@FindBy(xpath = "/html/body/app-root/div/div/rz-category/div/main/rz-catalog/div/div/aside/rz-filter-stack/div[2]/div/rz-scrollbar/div/div[1]/div/div/rz-filter-section-autocomplete/ul[1]/li[5]")
    public WebElement buttonHP;

    public void clickButtonHP() {
        LOGGER.info("Click HP button on side filter");
        buttonHP.click();
    }
}

package po;

import org.openqa.selenium.support.PageFactory;
import webDriver.DriverManager;
public class AbstractPO {
    public AbstractPO(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }
}

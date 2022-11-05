package Rozetka;

import org.openqa.selenium.By;
import org.testng.Assert;
import po.SideFilters;
import po.TopBar;
import util.PropertyReader;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Test extends DriverSet {
    @org.testng.annotations.Test
    public void test() {
        webDriver.get(PropertyReader.getValue("url"));
        TopBar topBar = new TopBar();

        topBar.fillSearchInput("laptop");
        topBar.clickSearchButton();

        SideFilters sideFilters = new SideFilters();
        try{
            TimeUnit.SECONDS.sleep(3);
            sideFilters.clickButtonHP();
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try{
            TimeUnit.SECONDS.sleep(1);
            topBar.clickOnChooseDropdownExpensive();
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        try {
            TimeUnit.SECONDS.sleep(2);
            webDriver.findElement(By.xpath("/html/body/app-root/div/div/rz-category/div/main/rz-catalog/div/div/section/rz-grid/ul/li[1]/rz-catalog-tile/app-goods-tile-default/div/div[2]/div[4]/div[2]/app-buy-button/button")).click();
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            TimeUnit.SECONDS.sleep(1);
            topBar.clickButtonBucket();
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            TimeUnit.SECONDS.sleep(5);
            
            String getPrice = webDriver.findElement(By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-shopping-cart/div/div[1]/div/div/div/span[1]")).getText();


            String[] arrOfStr = getPrice.split(" ");
            String newArr[] = Arrays.copyOf(arrOfStr, arrOfStr.length - 1);

            String str = String.join("", newArr);
            int expected = 200000;
            Assert.assertTrue(expected > Integer.parseInt(str));

        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

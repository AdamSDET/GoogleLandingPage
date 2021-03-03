package com.google.pages;

import com.google.utilities.BrowserUtilities;
import com.google.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LandingPage extends BasePage {
    public LandingPage() {
    }

    @FindBy(xpath = ("//a[@class='gb_D']"))
    public WebElement googleAppsLink;
    @FindBy(xpath = "//*[@id='gb']/div/div[1]/div/div[1]/a")
    public WebElement gmailLink;
    @FindBy(xpath = "//*[@id='gb']/div/div[1]/div/div[2]/a")
    public WebElement imagesLink;
    @FindBy(xpath = "/html/body/div[1]/div[1]/a[1]")
    public WebElement aboutLink;
    @FindBy(xpath = "/html/body/div[1]/div[1]/a[2]")
    public WebElement storeLink;
    @FindBy(xpath = "/html/body/div[1]/div[5]/div/div[2]/a[1]")
    public WebElement advertisingLink;
    @FindBy(xpath = "//*[@class='mH7Zad']")
    public WebElement commitmentsLink;
    @FindBy(xpath = "/html/body/div[1]/div[5]/div/div[2]/a[2]")
    public WebElement businessLink;
    @FindBy(xpath = "//*[@class='pHiOh'][3]")
    public WebElement howSearchWorksLink;
    @FindBy(xpath = "/html/body/div[1]/div[5]/div/div[3]/a[1]")
    public WebElement privacyLink;
    @FindBy(xpath = "/html/body/div[1]/div[5]/div/div[3]/a[2]")
    public WebElement termsLink;
    @FindBy(xpath = "/html/body/div[1]/div[5]/div/div[3]/div")
    public WebElement settingsLink;

    BrowserUtilities browserUtilities = new BrowserUtilities();

    public void titleVerification(String Google) {
        Assert.assertEquals(Driver.get().getTitle(), Google);
    }

    public void googleAppsLink() {
        Assert.assertTrue(googleAppsLink.isDisplayed());
    }

    public void gmailLink() {
        Assert.assertTrue(gmailLink.isDisplayed());
    }

    public void settingLink(){
        Assert.assertTrue(settingsLink.isDisplayed());
    }

    public void linksVerification(List<String> linkTexts) {
        List<String> actualTexts = new ArrayList<>();
        aboutLink.click();
        actualTexts.add(Driver.get().getTitle());
        Driver.get().navigate().back();
        storeLink.click();
        actualTexts.add(Driver.get().getTitle());
        Driver.get().navigate().back();
        gmailLink.click();
        actualTexts.add(Driver.get().getTitle());
        Driver.get().navigate().back();
        imagesLink.click();
        actualTexts.add(Driver.get().getTitle());
        Driver.get().navigate().back();
        advertisingLink.click();
        actualTexts.add(Driver.get().getTitle());
        Driver.get().navigate().back();
        commitmentsLink.click();
        actualTexts.add(Driver.get().getTitle());
        Driver.get().navigate().back();
        businessLink.click();
        actualTexts.add(Driver.get().getTitle());
        Driver.get().navigate().back();
        howSearchWorksLink.click();
        actualTexts.add(Driver.get().getTitle());
        Driver.get().navigate().back();
        browserUtilities.waitForWebElementVisibility(privacyLink, 10);
        privacyLink.click();
        actualTexts.add(Driver.get().getTitle());
        Driver.get().navigate().back();
        browserUtilities.waitForWebElementVisibility(termsLink, 10);
        termsLink.click();
        actualTexts.add(Driver.get().getTitle());
        Driver.get().navigate().back();

        if (actualTexts.size() != linkTexts.size()) {
            Assert.fail("Item number mismatch");
        }

        for (int i = 0; i < actualTexts.size(); i++) {
            Assert.assertTrue(actualTexts.get(i).contains(linkTexts.get(i)));
        }
    }

}

package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Utility {

    private static final Logger log = Logger.getLogger(ProductPage.class);

    @CacheLookup
    @FindBy(xpath = "//div[@id = 'content']//h1")
    WebElement productVerifyText;

    @CacheLookup
    @FindBy(id = "input-quantity")
    WebElement quantityTextBox;

    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement successAlertMsg;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement cartLinkInMsg;




    /**
     * This method will product verify text
     */
    public String getProductHeading(){
        log.info("get text"+productVerifyText.toString());
        return getTextFromElement(productVerifyText);
    }
    /**
     * This method will change the qty
     */
    public void enterQuantity(String qty){
        quantityTextBox.clear();
        sendTextToElement(quantityTextBox,qty);
        log.info("change"+qty);

    }
    /**
     * This method will add to cart button
     */
    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
        log.info("Click on " + addToCartButton.toString());
    }
    /**
     * This method will verify message
     */
    public String getSuccessAlertMsg(){
        log.info("text"+successAlertMsg.toString());
        return getTextFromElement(successAlertMsg);
    }
    /**
     * This method will click on link shopping cart into message
     */

    public void clickOnCartLinkInMsgButton() {
        clickOnElement(cartLinkInMsg);
        log.info("Click on " + cartLinkInMsg.toString());
}

}

package com.cydeo.pages;

import com.cydeo.step_definitions.GoogleStepDefinitions;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {


    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name="q")
    public WebElement searchBox;

    @FindBy(id="L2AGLb")
    public WebElement acceptButton;

}

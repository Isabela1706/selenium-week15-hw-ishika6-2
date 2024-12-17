package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.TopMenuPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class TopMenuSteps {
    @When("I mouse hover and click on desktop link")
    public void iMouseHoverAndClickOnDesktopLink() {
        new TopMenuPage().mouseHoverOnDesktopAndClick();

    }

    @And("I click on show all desktops link")
    public void iClickOnShowAllDesktopsLink() {
        new TopMenuPage().selectMenu("Show AllDesktops");

    }

    @When("I mouse hover and click on components link")
    public void iMouseHoverAndClickOnComponentsLink() {
        new TopMenuPage().mouseHoverOnComponentsAndClick();

    }

    @And("I click on Show all laptops and notebooks link")
    public void iClickOnShowAllLaptopsAndNotebooksLink() {
        new TopMenuPage().selectMenu("Show AllLaptops & Notebooks");
    }

    @And("I click on Show all components link")
    public void iClickOnShowAllComponentsLink() {
        new TopMenuPage().selectMenu("Show AllComponents");
    }

    @When("I mouse hover and click on laptops and notebooks link")
    public void iMouseHoverAndClickOnLaptopsAndNotebooksLink() {
        new TopMenuPage().mouseHoverOnLaptopsAndNotebookAndClick();
    }
}

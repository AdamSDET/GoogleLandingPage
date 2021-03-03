package com.google.steps;

import com.google.pages.BasePage;
import io.cucumber.java.en.Given;

public class GeneralSteps {

    private final BasePage basepage = new BasePage();

    @Given("User is on the google landing page")
    public void user_is_on_the_google_landing_page() {
        basepage.navigateToHomePage();
    }

}

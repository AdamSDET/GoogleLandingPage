package com.google.steps;

import com.google.pages.LandingPage;
import io.cucumber.java.en.Then;

import java.util.List;

public class LandingPageSteps {
    LandingPage landingPage = new LandingPage();

    @Then("User should see title is {string}")
    public void userShouldSeeTitleIs(String Google) {
        landingPage.titleVerification(Google);
    }

    @Then("User should see Gmail link")
    public void user_should_see_Gmail_link() {
        landingPage.gmailLink();
    }

    @Then("User should see google-apps icon")
    public void user_should_see_google_apps_icon() {
        landingPage.googleAppsLink();
    }

    @Then("User should see Settings link")
    public void user_should_see_Settings_link() {
        landingPage.settingLink();
    }

    @Then("User should verify links on the landing page")
    public void user_should_verify_links_on_the_landing_page(List<String> linkTexts) {
    landingPage.linksVerification(linkTexts);

    }


}
